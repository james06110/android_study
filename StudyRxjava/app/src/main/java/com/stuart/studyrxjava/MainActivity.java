package com.stuart.studyrxjava;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button button;
    private ImageView imageView;
    private final String URL = "http://tupian.aladd.net/2016/12/2421.jpg";
    private ProgressBar progressBar;

    private final static int MESSAGE_TEST_1 =1;



    private Handler mHandler =new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what){
                case MESSAGE_TEST_1:
                    progressBar.setVisibility(View.GONE);
                    imageView.setImageBitmap((Bitmap)msg.obj);
                    break;
            }


        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        imageView = (ImageView) findViewById(R.id.iv_bg);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        button.setOnClickListener(this);

    }

    public  void RxDownPic(){
        Observable<Bitmap> bitmapObservable =Observable.create(new Observable.OnSubscribe<Bitmap>() {
            @Override
            public void call(Subscriber<? super Bitmap> subscriber) {

                    Bitmap bitmap = NetSimpleUtils.getNetBitmap(URL);
                    subscriber.onCompleted();
                    subscriber.onNext(bitmap);
                    Log.d(" call ---> ", "运行在 " + Thread.currentThread().getName() + " 线程");
            }
        })
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
        Subscriber bitmapSubscriber =new Subscriber<Bitmap>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(Bitmap bitmap) {
                progressBar.setVisibility(View.GONE);
                imageView.setImageBitmap(bitmap);
                Log.d(" onNext ---> ", "运行在 " + Thread.currentThread().getName() + " 线程");

            }
        };
        bitmapObservable.subscribe(bitmapSubscriber);






    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
//                progressBar.setVisibility(View.VISIBLE);
//                RxDownPic();
//                DownPicTask task =new DownPicTask();
//                task.execute(URL);
                  DownPicForMessage();

                break;
        }
    }

    public void DownPicForMessage(){
        progressBar.setVisibility(View.VISIBLE);
        Thread thread =new Thread(){
            @Override
            public void run() {
                super.run();
                Log.d("DownPicForMessage--->", "运行在 " + Thread.currentThread().getName() + " 线程");
                Bitmap bitmap =NetSimpleUtils.getNetBitmap(URL);
                Message message =mHandler.obtainMessage();
                message.what=MESSAGE_TEST_1;
                message.obj =bitmap;
                message.sendToTarget();


            }
        };
        thread.start();





    }

    class DownPicTask extends AsyncTask<String,Integer,Bitmap>{

        @Override
        protected Bitmap doInBackground(String... params) {
            Log.d(" doInBackground ---> ", "运行在 " + Thread.currentThread().getName() + " 线程");
            Bitmap bitmap = NetSimpleUtils.getNetBitmap(URL);
            publishProgress(1);
            return bitmap;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            progressBar.setVisibility(View.VISIBLE);
            Log.d(" onPreExecute ---> ", "运行在 " + Thread.currentThread().getName() + " 线程");
        }

        @Override
        protected void onPostExecute(Bitmap bitmap) {
            super.onPostExecute(bitmap);
            progressBar.setVisibility(View.GONE);
            imageView.setImageBitmap(bitmap);
            Log.d(" onPostExecute ---> ", "运行在 " + Thread.currentThread().getName() + " 线程");
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
            Log.d(" onProgressUpdate ---> ", "更新进度为"+String.valueOf(values[0]));
        }
    }
}

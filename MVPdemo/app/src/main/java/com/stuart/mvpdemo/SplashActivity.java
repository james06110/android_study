package com.stuart.mvpdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import com.stuart.mvpdemo.base.BaseActivity;

import java.util.concurrent.TimeUnit;

import rx.Observable;
import rx.Observer;
import rx.Subscription;



/**
 * author:Stuart on 2016/9/29 0029.
 * time: 2016/9/29 0029 下午 13:57
 * description:
 */
public class SplashActivity extends Activity{


    private Subscription subscription;


    Observer observer =new Observer() {
        @Override
        public void onCompleted() {

        }

        @Override
        public void onError(Throwable e) {

        }

        @Override
        public void onNext(Object o) {
                    jump();
        }


    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_welcome);

//        observable =  Observable.timer(10, TimeUnit.MICROSECONDS)
//                .observeOn(AndroidSchedulers.mainThread());
//
//        observable.subscribe(new Action1() {
//            @Override
//            public void call(Object o) {
//                jump();
//            }
//        });

//        subscription =Observable.timer(10,TimeUnit.MICROSECONDS)
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Action1() {
//            @Override
//            public void call(Object o) {
//                    jump();
//            }
//        });










    }



    private void jump(){

          Intent intent =new Intent(SplashActivity.this,MainActivity.class);
          startActivity(intent);
          finish();


     }

    @Override
    public void onBackPressed() {
        subscription.unsubscribe();
        super.onBackPressed();
    }

    @Override
    protected void onPause() {
        subscription.unsubscribe();
        super.onPause();
    }

    @Override
    protected void onResume() {
        subscription =Observable.timer(1, TimeUnit.SECONDS).subscribe(observer);
        super.onResume();
    }


}

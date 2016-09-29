package com.stuart.mvpdemo;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;

import com.stuart.mvpdemo.bean.MovieInfo;
import com.stuart.mvpdemo.network.RetrofitUtil;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import rx.Subscriber;


public class MainActivity extends AppCompatActivity {


    @BindView(R.id.button)
    Button button;



    private MovieInfo mMovieInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mMovieInfo =new MovieInfo();

        onClick();

    }


    @OnClick(R.id.button)
    public void onClick() {

        //Toast.makeText(getApplicationContext(),"this is button",Toast.LENGTH_SHORT).show();

        getUSMovie();

        button.setText(mMovieInfo.getDate());


    }


    public void getUSMovie(){
        Subscriber<MovieInfo> subscriber = new Subscriber<MovieInfo>() {
            @Override
            public void onCompleted() {

                Toast.makeText(getApplicationContext(),"getUSMovie Completed",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onError(Throwable e) {
                Toast.makeText(getApplicationContext(),e.getMessage().toString(),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNext(MovieInfo movieInfo) {

                  mMovieInfo= movieInfo;



            }
        };
        RetrofitUtil.getInstance().getUSMovie(subscriber);
    }


    




}

package com.stuart.mvpdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;

import com.stuart.mvpdemo.bean.MovieInfo;

import java.sql.Time;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;


/**
 * author:Stuart on 2016/9/29 0029.
 * time: 2016/9/29 0029 下午 13:57
 * description:
 */
public class WelcomeActivity  extends Activity{


    private Observable observable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_welcome);

        observable =  Observable.timer(10, TimeUnit.MICROSECONDS)
                .observeOn(AndroidSchedulers.mainThread());

        observable.subscribe(new Action1() {
            @Override
            public void call(Object o) {
                 jump();
            }
        });






    }

    private void jump(){

         startActivity(new Intent(getApplicationContext(),MainActivity.class));
         WelcomeActivity.this.finish();

    }





}

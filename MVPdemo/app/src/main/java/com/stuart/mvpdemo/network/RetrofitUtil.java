package com.stuart.mvpdemo.network;

import com.stuart.mvpdemo.model.entity.MovieInfo;

import java.util.concurrent.TimeUnit;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Subscriber;
import okhttp3.OkHttpClient;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;


/**
 * author:Stuart on 2016/9/28 0028.
 * time: 2016/9/28 0028 上午 11:18
 * description:
 */
public class RetrofitUtil {

     private Retrofit retrofit;
     private DouBanApi douBanApi;
     private static RetrofitUtil instance;
     private static String BaseURL="https://api.douban.com/";





     private RetrofitUtil(){

         retrofit = new Retrofit.Builder()
                 .baseUrl(BaseURL)
                 .addConverterFactory(GsonConverterFactory.create())
                 .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                 .client(new OkHttpClient().newBuilder().connectTimeout(5, TimeUnit.SECONDS).build())
                 .build();
         douBanApi = retrofit.create(DouBanApi.class);
     }

     //单例
     public static RetrofitUtil getInstance(){
          if(instance==null){
               synchronized (RetrofitUtil.class){
                    instance =new RetrofitUtil();
               }
          }
          return  instance;
     }

     public  void  getUSMovie(Subscriber<MovieInfo> subscriber){

          douBanApi.getUSMovie().subscribeOn(Schedulers.io())
                                 .unsubscribeOn(Schedulers.io())
                                 .observeOn(AndroidSchedulers.mainThread())
                                 .subscribe(subscriber);


     }





}

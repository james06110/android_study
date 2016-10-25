package com.stuart.mvpdemo.network;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * author:Stuart on 2016/10/5 0005.
 * time: 2016/10/5 0005 下午 14:55
 * description:
 */
public class ApiRetrofit {

     public  static final  String DOUBAN_BASE_URL="https://api.douban.com/";
     public  static final  String ZHIHU_BASE_URL="http://news-at.zhihu.com/api/4/";

     public  DouBanApi douBanService;

     public  ZhiHuApi ZhiHuService;

    public ZhiHuApi getZhiHuService() {
        return ZhiHuService;
    }

    public DouBanApi getDouBanService() {
        return douBanService;
     }

    ApiRetrofit(){


        Retrofit retrofit_douban=new Retrofit.Builder()
                .baseUrl(DOUBAN_BASE_URL)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(OkHttpClientSingle.getInstance())
                .build();

        douBanService= retrofit_douban.create(DouBanApi.class);

        Retrofit retrofit_zhihu=new Retrofit.Builder()
                .baseUrl(ZHIHU_BASE_URL)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(OkHttpClientSingle.getInstance())
                .build();

         ZhiHuService =retrofit_zhihu.create(ZhiHuApi.class);

    }




}

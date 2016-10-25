package com.stuart.mvpdemo.network;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;

/**
 * author:Stuart on 2016/10/6 0006.
 * time: 2016/10/6 0006 上午 9:35
 * description:
 */
public class OkHttpClientSingle {

          private static  OkHttpClient.Builder okHttpBuilder;

          private OkHttpClientSingle(){
               okHttpBuilder =new OkHttpClient.Builder();
               okHttpBuilder.connectTimeout(30, TimeUnit.SECONDS);
          }

          public static OkHttpClient getInstance(){
              if(okHttpBuilder ==null){
                  synchronized (OkHttpClient.class){
                      if (okHttpBuilder==null){
                          new OkHttpClientSingle();
                      }
                  }
              }
              return  okHttpBuilder.build();
          }


}

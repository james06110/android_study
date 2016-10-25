package com.stuart.mvpdemo.network;



/**
 * author:Stuart on 2016/9/28 0028.
 * time: 2016/9/28 0028 下午 15:54
 * description:
 */
public class ApiFactory {

     protected  static  final  Object monitor = new Object();

     static DouBanApi douBanApiSingleton=null;

     static ZhiHuApi  zhiHuApiSingleton=null;

     public static DouBanApi getDouBanApiSingleton(){
         synchronized (monitor){
             if(douBanApiSingleton==null){
                 douBanApiSingleton =new ApiRetrofit().getDouBanService();
             }
             return douBanApiSingleton;
         }
     }

     //知乎日报
     public static ZhiHuApi getZhiHuApiSingleton(){
         synchronized (monitor){
             if(zhiHuApiSingleton==null){
                 zhiHuApiSingleton =new ApiRetrofit().getZhiHuService();
             }
             return zhiHuApiSingleton;
         }

     }








}

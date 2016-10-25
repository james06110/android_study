package com.stuart.mvpdemo.network;

import com.stuart.mvpdemo.model.entity.ZhihuDailyLatest;
import com.stuart.mvpdemo.model.entity.ZhihuDailyNews;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * author:Stuart on 2016/10/12 0012.
 * time: 2016/10/12 0012 下午 18:36
 * description:
 */
public interface ZhiHuApi {


    //获取知乎日报最新消息
    @GET("news/latest")
    Observable<ZhihuDailyLatest> getLatestNews();

    //获取最新消息ID的具体内容
    @GET("news/{id}")
    Observable<ZhihuDailyNews> getDailyNews(@Path("id") String id);












}

package com.stuart.mvpdemo.network;

import com.stuart.mvpdemo.model.entity.MovieInfo;


import retrofit2.http.GET;
import rx.Observable;

/**
 * author:Stuart
 * time: 2016/9/28  上午 10:59
 * description:
 */
public interface DouBanApi {

    @GET("v2/movie/us_box")
    Observable<MovieInfo> getUSMovie();



}

package com.stuart.mvpdemo.model;


import com.stuart.mvpdemo.base.OnHttpCallBack;
import com.stuart.mvpdemo.contract.MovieContract;
import com.stuart.mvpdemo.model.entity.MovieInfo;
import com.stuart.mvpdemo.network.ApiFactory;

import retrofit2.adapter.rxjava.HttpException;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;



/**
 * author:Stuart on 2016/10/6 0006.
 * time: 2016/10/6 0006 上午 10:25
 * description:
 */
public class MovieModel  implements  MovieContract.IMovieModel{



    @Override
    public void getUsMovieData(final OnHttpCallBack<MovieInfo> callBack) {

              ApiFactory.getDouBanApiSingleton().getUSMovie()
                      .subscribeOn(Schedulers.io())
                      .unsubscribeOn(Schedulers.io())
                      .observeOn(AndroidSchedulers.mainThread())
                      .subscribe(new Subscriber<MovieInfo>() {
                          @Override
                          public void onCompleted() {
                                callBack.onFailure("开始");
                          }

                          @Override
                          public void onStart() {
                              callBack.onFailure("开始");
                          }

                          @Override
                          public void onError(Throwable e) {
                               e.printStackTrace();
                               if(e instanceof HttpException){
                                   HttpException httpException = (HttpException) e;
                                   int code = httpException.code();
                                   if (code == 500 || code == 404  ) {
                                       callBack.onFailure("错误");
                                   }
                               }

                          }

                          @Override
                          public void onNext(MovieInfo movieInfo) {
                                  callBack.onSuccessful(movieInfo);
                          }

                      });

    }
}

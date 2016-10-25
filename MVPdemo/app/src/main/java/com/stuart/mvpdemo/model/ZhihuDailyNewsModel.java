package com.stuart.mvpdemo.model;

import com.stuart.mvpdemo.base.OnHttpCallBack;
import com.stuart.mvpdemo.contract.ZhihuDailyNewsContract;
import com.stuart.mvpdemo.model.entity.ZhihuDailyNews;
import com.stuart.mvpdemo.network.ApiFactory;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * author:Stuart on 2016/10/21 0021.
 * time: 2016/10/21 0021 下午 15:38
 * description:
 */
public class ZhihuDailyNewsModel implements ZhihuDailyNewsContract.IModel {
    @Override
    public void getNewData(final OnHttpCallBack onHttpCallBack,String id) {

        ApiFactory.getZhiHuApiSingleton().getDailyNews(id)
                 .subscribeOn(Schedulers.io())
                 .unsubscribeOn(Schedulers.io())
                 .observeOn(AndroidSchedulers.mainThread())
                 .subscribe(new Subscriber<ZhihuDailyNews>() {
                     @Override
                     public void onCompleted() {

                     }

                     @Override
                     public void onStart() {
                         super.onStart();
                         onHttpCallBack.onFailure("start");
                     }

                     @Override
                     public void onError(Throwable e) {
                         onHttpCallBack.onFailure("error");
                     }

                     @Override
                     public void onNext(ZhihuDailyNews zhihuDailyNews) {
                         onHttpCallBack.onSuccessful(zhihuDailyNews);
                     }
                 });




    }
}

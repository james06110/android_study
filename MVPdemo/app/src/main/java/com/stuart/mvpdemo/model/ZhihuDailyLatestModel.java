package com.stuart.mvpdemo.model;

import com.orhanobut.logger.Logger;
import com.stuart.mvpdemo.base.OnHttpCallBack;
import com.stuart.mvpdemo.contract.ZhihuDailyLatestContract;
import com.stuart.mvpdemo.model.entity.ZhihuDailyLatest;
import com.stuart.mvpdemo.network.ApiFactory;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * author:Stuart on 2016/10/12 0012.
 * time: 2016/10/12 0012 下午 18:44
 * description:
 */
public class ZhihuDailyLatestModel implements ZhihuDailyLatestContract.INewModel {
    @Override
    public void getNewData(final OnHttpCallBack onHttpCallBack) {

        ApiFactory.getZhiHuApiSingleton().getLatestNews()
                  .subscribeOn(Schedulers.io())
                  .unsubscribeOn(Schedulers.io())
                  .observeOn(AndroidSchedulers.mainThread())
                  .subscribe(new Subscriber<ZhihuDailyLatest>() {
                      @Override
                      public void onCompleted() {
                          onHttpCallBack.onFailure("ok");
                      }


                      @Override
                      public void onStart() {
                          super.onStart();
                          onHttpCallBack.onFailure("start");
                          Logger.e("start");

                      }

                      @Override
                      public void onError(Throwable e) {
                           e.printStackTrace();
                           onHttpCallBack.onFailure("error");
                           Logger.e("error");

                      }

                      @Override
                      public void onNext(ZhihuDailyLatest zhihuDailyLatest) {
                           onHttpCallBack.onSuccessful(zhihuDailyLatest);
                      }
                  });

    }
}

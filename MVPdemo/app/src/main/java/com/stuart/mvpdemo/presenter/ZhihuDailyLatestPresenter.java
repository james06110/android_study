package com.stuart.mvpdemo.presenter;

import com.stuart.mvpdemo.base.OnHttpCallBack;
import com.stuart.mvpdemo.contract.ZhihuDailyLatestContract;
import com.stuart.mvpdemo.model.ZhihuDailyLatestModel;
import com.stuart.mvpdemo.model.entity.ZhihuDailyLatest;

/**
 * author:Stuart on 2016/10/13 0013.
 * time: 2016/10/13 0013 上午 8:37
 * description:
 */
public class ZhihuDailyLatestPresenter implements ZhihuDailyLatestContract.INewPresenter {

    ZhihuDailyLatestContract.INewModel mINewModel; //M
    ZhihuDailyLatestContract.INewView  mINewView;  //V


    public ZhihuDailyLatestPresenter(ZhihuDailyLatestContract.INewView mINewView){
              this.mINewView=mINewView;
              mINewModel=new ZhihuDailyLatestModel();

    }


    @Override
    public void getNewData() {

              mINewModel.getNewData(new OnHttpCallBack<ZhihuDailyLatest>() {
                  @Override
                  public void onSuccessful(ZhihuDailyLatest zhihuDailyLatest) {
                      mINewView.hideProgress();
                      mINewView.showNewData(zhihuDailyLatest);

                  }

                  @Override
                  public void onFailure(String errorMsg) {
                        switch (errorMsg){
                            case "error":
                                mINewView.showError();
                                break;
                            case "start":
                                mINewView.showProgress();
                                break;

                        }

                  }
              });

    }


}

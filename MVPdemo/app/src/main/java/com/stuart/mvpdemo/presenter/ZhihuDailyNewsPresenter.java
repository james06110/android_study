package com.stuart.mvpdemo.presenter;

import com.stuart.mvpdemo.base.OnHttpCallBack;
import com.stuart.mvpdemo.contract.ZhihuDailyNewsContract;
import com.stuart.mvpdemo.model.ZhihuDailyNewsModel;
import com.stuart.mvpdemo.model.entity.ZhihuDailyNews;

/**
 * author:Stuart on 2016/10/21 0021.
 * time: 2016/10/21 0021 下午 15:52
 * description:
 */
public class ZhihuDailyNewsPresenter  implements ZhihuDailyNewsContract.IPresenter{

    ZhihuDailyNewsContract.IModel iModel;
    ZhihuDailyNewsContract.IView iView;
    String id;
    public  ZhihuDailyNewsPresenter(ZhihuDailyNewsContract.IView iView,String id){
                this.iView = iView;
                iModel =new ZhihuDailyNewsModel();
                this.id=id;
    }


    @Override
    public void getNewData() {

             iModel.getNewData(new OnHttpCallBack<ZhihuDailyNews>() {

                 @Override
                 public void onSuccessful(ZhihuDailyNews zhihuDailyNews) {
                           iView.showNewData(zhihuDailyNews);
                 }

                 @Override
                 public void onFailure(String errorMsg) {

                 }
             },id);


    }
}

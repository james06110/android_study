package com.stuart.mvpdemo.contract;

import android.content.Context;

import com.stuart.mvpdemo.base.OnHttpCallBack;
import com.stuart.mvpdemo.model.entity.ZhihuDailyLatest;
import com.stuart.mvpdemo.model.entity.ZhihuDailyNews;

/**
 * author:Stuart on 2016/10/21 0021.
 * time: 2016/10/21 0021 下午 15:41
 * description:
 */
public class ZhihuDailyNewsContract {

    public interface  IModel{

        void getNewData(OnHttpCallBack onHttpCallBack,String id);


    }

    public interface IView{
        void  showNewData(ZhihuDailyNews zhihuDailyNews);
        void  showProgress();
        void  hideProgress();
        Context getCurContent();
        void  showError();


    }


    public interface IPresenter{

        void  getNewData();


    }

}

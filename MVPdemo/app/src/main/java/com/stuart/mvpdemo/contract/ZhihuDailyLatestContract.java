package com.stuart.mvpdemo.contract;

import android.content.Context;

import com.stuart.mvpdemo.base.OnHttpCallBack;
import com.stuart.mvpdemo.model.entity.ZhihuDailyLatest;

/**
 * author:Stuart on 2016/10/12 0012.
 * time: 2016/10/12 0012 下午 18:45
 * description:
 */
public class ZhihuDailyLatestContract {


        public interface  INewModel{

            void getNewData(OnHttpCallBack onHttpCallBack);
        }

        public interface INewView{
            void  showNewData(ZhihuDailyLatest zhihuDailyLatest);
            void  showProgress();
            void  hideProgress();
            Context getCurContent();
            void  showError();

        }


        public interface INewPresenter{

             void  getNewData();


        }





}

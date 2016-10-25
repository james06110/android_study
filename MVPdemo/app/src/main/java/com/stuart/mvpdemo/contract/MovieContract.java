package com.stuart.mvpdemo.contract;

import android.content.Context;

import com.stuart.mvpdemo.base.OnHttpCallBack;
import com.stuart.mvpdemo.model.entity.MovieInfo;

/**
 * author:Stuart on 2016/10/6 0006.
 * time: 2016/10/6 0006 上午 10:22
 * description:
 * MVP中三层的接口的集中营,改需求很方便,使得代码结构更加清晰
 */
public class MovieContract {

    /**
     * M逻辑(业务)处理层
     **/
    public interface IMovieModel {
        void getUsMovieData(OnHttpCallBack<MovieInfo> callBack);


    }

    /**
     * V视图层
     **/
    public interface IMovieView {

        void showData(MovieInfo movieInfo);

        //void showProgress();

        //void hideProgress();


    }




    /**
     * P视图与逻辑处理的连接层
     **/
    public interface IMoviePresenter {

        void getUsMovieData();
    }


}

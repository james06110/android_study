package com.stuart.mvpdemo.presenter;

import com.stuart.mvpdemo.base.OnHttpCallBack;
import com.stuart.mvpdemo.contract.MovieContract;
import com.stuart.mvpdemo.model.MovieModel;
import com.stuart.mvpdemo.model.entity.MovieInfo;

/**
 * author:Stuart on 2016/10/6 0006.
 * time: 2016/10/6 0006 上午 11:21
 * description:
 */
public class MoviePresenter implements MovieContract.IMoviePresenter{


    MovieContract.IMovieModel mIMovieModel;//M层
    MovieContract.IMovieView mIMovieView;//V层


    public MoviePresenter(MovieContract.IMovieView mIMovieView){
        this.mIMovieView = mIMovieView;
        mIMovieModel = new MovieModel();
    }



    @Override
    public void getUsMovieData() {

          mIMovieModel.getUsMovieData(new OnHttpCallBack<MovieInfo>() {
              @Override
              public void onSuccessful(MovieInfo movieInfo) {
                     //mIMovieView.hideProgress();
                     mIMovieView.showData(movieInfo);

              }

              @Override
              public void onFailure(String errorMsg) {
                      if(errorMsg=="开始"){
                          //mIMovieView.showProgress();
                      }else {
                          //mIMovieView.showProgress();
                      }

              }


          });


    }
}

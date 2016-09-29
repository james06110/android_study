package com.stuart.mvpdemo.model;

import com.stuart.mvpdemo.presenter.OnWeatherListener;

/**
 * Created by Stuart on 2016/9/22.
 */
public interface WeatherModel {

     void loadData(String City,OnWeatherListener listener);

}

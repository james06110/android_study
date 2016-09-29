package com.stuart.mvpdemo.presenter;

import com.stuart.mvpdemo.model.entity.Weather;

/**
 * Created by Stuart on 2016/9/22.
 */
public interface OnWeatherListener {

    /**
     * 成功时回调
     *
     * @param weather
     */
    void onSuccess(Weather weather);
    /**
     * 失败时回调，简单处理，没做什么
     */
    void onError();


}

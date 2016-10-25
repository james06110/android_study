package com.stuart.mvpdemo.base;

/**
 * author:Stuart on 2016/10/6 0006.
 * time: 2016/10/6 0006 上午 10:51
 * description:
 */
public interface OnHttpCallBack<T> {

    void onSuccessful(T t);//成功了就回调这个方法,可以传递任何形式的数据给调用者

    void onFailure(String errorMsg);//失败了就调用这个方法,可以传递错误的请求消息给调用者
}

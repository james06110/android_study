package com.stuart.mvpdemo;


import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.orhanobut.logger.Logger;
import com.stuart.mvpdemo.adapter.ZNewsAdapter;
import com.stuart.mvpdemo.base.BaseActivity;
import com.stuart.mvpdemo.contract.ZhihuDailyLatestContract;
import com.stuart.mvpdemo.model.entity.ZhihuDailyLatest;
import com.stuart.mvpdemo.presenter.ZhihuDailyLatestPresenter;

import java.util.concurrent.TimeUnit;

import butterknife.BindView;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;


public class MainActivity extends BaseActivity implements ZhihuDailyLatestContract.INewView {


    ZhihuDailyLatestPresenter zhihuDailyLatestPresenter;
    @BindView(R.id.layout_swipe_refresh)
    SwipeRefreshLayout layoutSwipeRefresh;
    @BindView(R.id.nav_view)
    NavigationView mNavigationView;
    @BindView(R.id.drawer)
    DrawerLayout mDrawerLayout;
    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;


    private ProgressDialog mProgressDialog;
    private ActionBarDrawerToggle mActionBarDrawerToggle;

    private AlertDialog.Builder mAlertBuilder;

    private Observable observable;

    private ZNewsAdapter zNewsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        //ButterKnife.bind(this);

        mToolbar.setTitle(R.string.app_name);

        mActionBarDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, mToolbar, R.string.open, R.string.close);
        mDrawerLayout.addDrawerListener(mActionBarDrawerToggle);
        mDrawerLayout.setClipToPadding(false);
        mActionBarDrawerToggle.syncState();
        mNavigationView.inflateHeaderView(R.layout.nav_header_main);


        zhihuDailyLatestPresenter = new ZhihuDailyLatestPresenter(this);

        zhihuDailyLatestPresenter.getNewData();


        layoutSwipeRefresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                loadData();

            }
        });


    }

    @Override
    protected int getContentView() {
        return R.layout.activity_main;
    }


    public void loadData() {
        observable = Observable.timer(60, TimeUnit.MICROSECONDS)
                .observeOn(AndroidSchedulers.mainThread());

        observable.subscribe(new Action1() {
            @Override
            public void call(Object o) {

                Toast.makeText(getApplicationContext(), "刷新成功", Toast.LENGTH_SHORT).show();
                layoutSwipeRefresh.setRefreshing(false);
            }
        });


    }


    @Override
    public void showNewData(final ZhihuDailyLatest zhihuDailyLatest) {

        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));

        zNewsAdapter = new ZNewsAdapter(getApplicationContext(), zhihuDailyLatest);

        recyclerView.setAdapter(zNewsAdapter);


        zNewsAdapter.setmOnItemClickListener(new ZNewsAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                //Toast.makeText(getApplicationContext(),String.valueOf(position),Toast.LENGTH_SHORT).show();

                String id = String.valueOf(zhihuDailyLatest.getStories().get(position).getId());

                Logger.i(String.valueOf(zhihuDailyLatest.getStories().get(position).getId()));

                jumpActivity(id);

            }

            @Override
            public void onItemLongClick(View view, int position) {
                Toast.makeText(getApplicationContext(), position, Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public void showProgress() {
        mProgressDialog = ProgressDialog.show(getCurContent(), "tips", "load.....");


    }

    @Override
    public void hideProgress() {

        mProgressDialog.hide();

    }

    @Override
    public Context getCurContent() {
        return this;
    }

    @Override
    public void showError() {
        mAlertBuilder = new AlertDialog.Builder(getCurContent());
        mAlertBuilder.setTitle("提示");
        mAlertBuilder.setMessage("网络连接超时！");
        mAlertBuilder.setNegativeButton("关闭", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        mAlertBuilder.show();

        //Toast.makeText(getCurContent(),"请求失败",Toast.LENGTH_SHORT).show();


    }

    public void jumpActivity(String id) {
        Intent intent = new Intent(MainActivity.this, NewsActivity.class);
        intent.putExtra("id", id);
        startActivity(intent);


    }


}

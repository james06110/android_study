package com.stuart.mvpdemo.base;


import android.os.Build;
import android.os.Bundle;

import android.support.design.widget.AppBarLayout;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;


import com.orhanobut.logger.Logger;
import com.readystatesoftware.systembartint.SystemBarTintManager;
import com.stuart.mvpdemo.R;

import butterknife.ButterKnife;

/**
 * Created by stuart on 23/10/16.
 */

public abstract class BaseActivity extends AppCompatActivity {


    protected Toolbar mToolbar;
    protected AppBarLayout mAppBarLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentView());
        ButterKnife.bind(this);

        mToolbar=(Toolbar)findViewById(R.id.toolbar);

        mAppBarLayout=(AppBarLayout)findViewById(R.id.app_bar);
        //mToolbar.setFitsSystemWindows(true);


        //设置返回键
        if(mToolbar !=null && mAppBarLayout !=null){
             setSupportActionBar(mToolbar);//把toolbar 当actionbar设置
             if(isBack()){
                 ActionBar actionBar =getSupportActionBar();
                 if (actionBar != null) {
                     actionBar.setDisplayHomeAsUpEnabled(true);//设置ActionBar一个返回箭头，主界面没有，次级界面有
                 }




             }

        }
        //专为4.4及5.0适配状态栏
        if (Build.VERSION.SDK_INT <= Build.VERSION_CODES.KITKAT) {
            //透明状态栏
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            //透明导航栏
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);


            mToolbar.getLayoutParams().height = getAppBarHeight();
            mToolbar.setPadding(mToolbar.getPaddingLeft(),
                    getStatusBarHeight(),
                    mToolbar.getPaddingRight(),
                    mToolbar.getPaddingBottom());

        }






    }

    private int getAppBarHeight()
    {
        return dip2px(56)+getStatusBarHeight();
    }

    private int getStatusBarHeight()
    {
        int result = 0;
        int resourceId = getResources().getIdentifier("status_bar_height", "dimen", "android");

        if (resourceId > 0)
        {
            result = getResources().getDimensionPixelSize(resourceId);
        }

        return result;
    }

    private  int dip2px(float dipValue)
    {
        final float scale = getResources().getDisplayMetrics().density;
        return (int) (dipValue * scale + 0.5f);
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home){
            onBackPressed();
            finish();

        }
        return super.onOptionsItemSelected(item);

    }

    /**
     * 判断当前 Activity 是否允许返回
     * 主界面不允许返回，次级界面允许返回
     *
     * @return false
     */
    public boolean isBack() {
        return false;
    }

    abstract protected int getContentView();//用于引入布局文件
}

package com.stuart.mvpdemo;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.orhanobut.logger.Logger;
import com.stuart.mvpdemo.base.BaseActivity;
import com.stuart.mvpdemo.contract.ZhihuDailyNewsContract;
import com.stuart.mvpdemo.model.entity.ZhihuDailyNews;
import com.stuart.mvpdemo.presenter.ZhihuDailyNewsPresenter;

import butterknife.BindView;

import static com.stuart.mvpdemo.R.id.toolbar;

/**
 * Created by stuart on 22/10/16.
 */

public class NewsActivity extends BaseActivity implements ZhihuDailyNewsContract.IView {


    @BindView(R.id.NewsWebView)
    WebView NewsWebView;
    @BindView(R.id.progressBar)
    ProgressBar progressBar;
    @BindView(R.id.bg_img)
    ImageView bgImg;
    @BindView(R.id.tv_img_source)
    TextView tvImgSource;
    @BindView(R.id.collapsing_toolbar_layout)
    CollapsingToolbarLayout collapsingToolbarLayout;
    @BindView(R.id.app_bar)
    AppBarLayout appBar;
    @BindView(R.id.title_view_bg)
    LinearLayout titleViewBg;
    private String NewsID;
    ZhihuDailyNewsPresenter mZhihuDailyNewsPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_news);
        //ButterKnife.bind(this);

        //mToolbar.setTitle(R.string.app_name);





        Intent intent = getIntent();
        NewsID = intent.getStringExtra("id");
        Logger.i(String.valueOf(NewsID));
        progressBar.setMax(100);
        appBar.setFitsSystemWindows(true);


        titleViewBg.setBackgroundColor(Color.BLACK);
        titleViewBg.getBackground().setAlpha(100);


        mZhihuDailyNewsPresenter = new ZhihuDailyNewsPresenter(this, NewsID);
        mZhihuDailyNewsPresenter.getNewData();


    }

    @Override
    public boolean isBack() {
        return true;
    }

    @Override
    protected int getContentView() {
        return R.layout.activity_news;
    }

    @Override
    public void showNewData(ZhihuDailyNews zhihuDailyNews) {
        Logger.i(zhihuDailyNews.getBody());
        InitUIs(getApplicationContext(), zhihuDailyNews);
    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public Context getCurContent() {
        return this;
    }

    @Override
    public void showError() {

    }

    public void InitUIs(Context context, ZhihuDailyNews zhihuDailyNews) {

        //init bar
        String title = zhihuDailyNews.getTitle();
        String img_url = zhihuDailyNews.getImage();
        String tv_source = zhihuDailyNews.getImage_source();

        collapsingToolbarLayout.setTitle(title);

        collapsingToolbarLayout.setExpandedTitleColor(Color.WHITE);
        collapsingToolbarLayout.setCollapsedTitleTypeface(Typeface.DEFAULT_BOLD);//设置收缩的字体类型
        collapsingToolbarLayout.setExpandedTitleTypeface(Typeface.DEFAULT_BOLD);//设置滑出的字体类型




        Glide.with(context).load(img_url).into(bgImg);
        tvImgSource.setText(tv_source);
        tvImgSource.setTextColor(Color.WHITE);


        //init WebView
        WebSettings settings = NewsWebView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        String head = "<head>\n" +
                "\t<link rel=\"stylesheet\" href=\"" + zhihuDailyNews.getCss().get(0) + "\"/>\n" +
                "</head>";
        String img = "<div class=\"headline\">";
        String html = "<html><body>" + head + zhihuDailyNews.getBody().replace(img, " ") + "</body></html>";
        NewsWebView.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
        NewsWebView.setWebChromeClient(new WebChromeClient() {
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                //super.onProgressChanged(view, newProgress);
                if (newProgress == 100) {
                    progressBar.setVisibility(View.GONE);
                    Toast.makeText(getApplicationContext(), "加载完成", Toast.LENGTH_SHORT).show();


                } else {
                    progressBar.setVisibility(View.VISIBLE);
                    progressBar.setProgress(newProgress);
                }

                Logger.i(String.valueOf(newProgress));

            }
        });


    }




}
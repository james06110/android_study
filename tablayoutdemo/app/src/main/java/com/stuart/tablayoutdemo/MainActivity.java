package com.stuart.tablayoutdemo;
import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;



public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private MyAdapter myAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout =(TabLayout)findViewById(R.id.tab);
        viewPager =(ViewPager)findViewById(R.id.vp);

        tabLayout.setSelectedTabIndicatorColor(getResources().getColor(R.color.colorAccent));//设置选择条的颜色
        tabLayout.setBackgroundColor(getResources().getColor(R.color.colorPrimary));//设置tablayout背景颜色
        tabLayout.setTabTextColors(Color.WHITE,Color.BLACK);//第一个为未选中色，第二个为选中色

        initView();


    }

    private  void initView(){

        //把自定义FragmentStatePagerAdapter与ViewPager绑定
        myAdapter =new MyAdapter(getSupportFragmentManager());
        viewPager.setAdapter(myAdapter);

        //把ViewPager与TabLayout绑定
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabMode(TabLayout.MODE_FIXED); //Tab平均分
    }
}

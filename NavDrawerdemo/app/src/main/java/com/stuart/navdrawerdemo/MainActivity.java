package com.stuart.navdrawerdemo;

import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private  Toolbar toolbar;
    private DrawerLayout mDrawerLayout;
    private NavigationView mNavigationView;
    private ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("OkLife");//设置toolbar 标题
        toolbar.inflateMenu(R.menu.app_bar_menu);//设置菜单
        //菜单点击监听器
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                if(item.getItemId()==R.id.action_bar_title){
                    Toast.makeText(getApplication(),"this is title ",Toast.LENGTH_SHORT).show();
                }

                return false;
            }
        });


        mDrawerLayout =(DrawerLayout)findViewById(R.id.drawer_layout);
        toggle =new ActionBarDrawerToggle(this,mDrawerLayout,toolbar,R.string.open,R.string.close);
        mDrawerLayout.addDrawerListener(toggle);
        toggle.syncState();


        mNavigationView=(NavigationView)findViewById(R.id.nav_view);

        //mNavigationView.inflateHeaderView(R.layout.nav_header_main);

        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                if(item.getItemId()==R.id.nav_camera){
                    Toast.makeText(getApplication(),"我不管我最可爱 ",Toast.LENGTH_SHORT).show();
                }
                return false;

            }
        });
    }
}

package com.stuart.toolbardemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toolbar);

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



    }
}

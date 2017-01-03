package com.stuart.studyrxjava;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Stuart on 2016/12/29.
 */

public class NetSimpleUtils {


     /**
     * 简单请求网络url
     * @param URL
     * @return
     */
     public static Bitmap getNetBitmap(String URL){
          Bitmap bitmap =null;
          HttpURLConnection httpURLConnection =null;
          InputStream is;
          BufferedInputStream bis;
          try {
               URL url =new URL(URL);
               httpURLConnection=(HttpURLConnection)url.openConnection();
               httpURLConnection.setRequestMethod("GET");
               httpURLConnection.setConnectTimeout(3000);
               Thread.sleep(2000);//为了演示，所以让你休息2S
               is =httpURLConnection.getInputStream();
               bis =new BufferedInputStream(is);
               bitmap= BitmapFactory.decodeStream(bis);
               is.close();
               bis.close();

          } catch (Exception e) {
               e.printStackTrace();
          }
          finally {
               httpURLConnection.disconnect();
          }
          return  bitmap;
     }



}

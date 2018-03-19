package com.wintelbd.digitalcenter;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Maruf on 18-Mar-18.
 */

public class LunchScreen extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 1000;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lunch_screen);


        new Handler().postDelayed(new Runnable(){
            @Override
            public  void run(){

                Intent goToMain = new Intent(LunchScreen.this, MainActivity.class);
                startActivity(goToMain);
                finish();
            }

        },SPLASH_TIME_OUT );

    }
}
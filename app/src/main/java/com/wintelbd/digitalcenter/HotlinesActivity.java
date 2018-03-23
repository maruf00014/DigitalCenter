package com.wintelbd.digitalcenter;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class HotlinesActivity extends AppCompatActivity {

    ImageView sorkariSheba,balloBibaho,nariNirjaton,dorjog,nationalEmergency;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotlines);

        Toolbar toolbar = (Toolbar) findViewById(R.id.hot_toolbar);
        setSupportActionBar(toolbar);

        sorkariSheba = findViewById(R.id.sorkari_seba);

        sorkariSheba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                Animation animFadein = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
                sorkariSheba.startAnimation(animFadein);
                intent.setData(Uri.parse("tel:333"));

                if (checkPermission()) {
                    startActivity(intent);
                }
                else {

                    requestPermission();
                }
            }
        });


        balloBibaho = findViewById(R.id.ballo_bibaho);

        balloBibaho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                Animation animFadein = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
                balloBibaho.startAnimation(animFadein);
                intent.setData(Uri.parse("tel:*16100"+Uri.encode("#")));

                if (checkPermission()) {
                    startActivity(intent);
                }
                else {

                    requestPermission();
                }
            }
        });


        nariNirjaton = findViewById(R.id.nari_nirjaton);

        nariNirjaton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                Animation animFadein = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
                nariNirjaton.startAnimation(animFadein);
                intent.setData(Uri.parse("tel:1098"));

                if (checkPermission()) {
                    startActivity(intent);
                }
                else {

                    requestPermission();
                }
            }
        });

        dorjog = findViewById(R.id.dorjok);

        dorjog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                Animation animFadein = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
                dorjog.startAnimation(animFadein);
                intent.setData(Uri.parse("tel:1090"));

                if (checkPermission()) {
                    startActivity(intent);
                }
                else {

                    requestPermission();
                }
            }
        });


        nationalEmergency = findViewById(R.id.national_emergency);

        nationalEmergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                Animation animFadein = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
                nationalEmergency.startAnimation(animFadein);
                intent.setData(Uri.parse("tel:999"));

                if (checkPermission()) {
                    startActivity(intent);
                }
                else {

                    requestPermission();
                }
            }
        });
    }


    public void requestPermission(){

        ActivityCompat.requestPermissions(
                HotlinesActivity.this,
                new String[]{Manifest.permission.CALL_PHONE},
                1);
    }

    public boolean checkPermission(){
        return ActivityCompat.checkSelfPermission(HotlinesActivity.this,
                Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED;
    }
}

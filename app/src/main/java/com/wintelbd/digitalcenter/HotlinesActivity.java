package com.wintelbd.digitalcenter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class HotlinesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotlines);

        Toolbar toolbar = (Toolbar) findViewById(R.id.hot_toolbar);
        setSupportActionBar(toolbar);
    }
}

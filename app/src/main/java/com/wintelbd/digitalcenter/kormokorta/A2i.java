package com.wintelbd.digitalcenter.kormokorta;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.wintelbd.digitalcenter.R;

/**
 * Created by Maruf on 23-Mar-18.
 */

public class A2i extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo_list);

        Toolbar toolbar = (Toolbar) findViewById(R.id.demo_toolbar);
        setSupportActionBar(toolbar);
    }

}

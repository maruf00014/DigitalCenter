package com.wintelbd.digitalcenter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.wintelbd.digitalcenter.kormokorta.A2i;

public class OfficersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_officers);

        Toolbar toolbar = (Toolbar) findViewById(R.id.off_toolbar);
        setSupportActionBar(toolbar);

        final ImageView a2i = findViewById(R.id.a2i);
        a2i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OfficersActivity.this, A2i.class);
                Animation animFadein = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
                a2i.startAnimation(animFadein);
                startActivity(intent);
            }
        });


    }

}

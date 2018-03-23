package com.wintelbd.digitalcenter;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class WebsitesActivity extends AppCompatActivity {

    ImageView porcharAbedon, tothoUpload, uiscbd,eksheba,jonmoNibondhon,inamjari;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_websites);
        Toolbar toolbar = (Toolbar) findViewById(R.id.web_toolbar);
        setSupportActionBar(toolbar);

        porcharAbedon = findViewById(R.id.porchar_abedon);
        porcharAbedon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new
                        Intent(Intent.ACTION_VIEW, Uri.parse("http://uams.e-service.gov.bd"));
                startActivity(browserIntent);
            }
        });


        tothoUpload = findViewById(R.id.totho_upload);
        tothoUpload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new
                        Intent(Intent.ACTION_VIEW, Uri.parse("http://dcms.e-service.gov.bd"));
                startActivity(browserIntent);
            }
        });


        uiscbd = findViewById(R.id.uisc);
        uiscbd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new
                        Intent(Intent.ACTION_VIEW, Uri.parse("http://uiscbd.ning.com"));
                startActivity(browserIntent);
            }
        });


        eksheba = findViewById(R.id.eksheba);
        eksheba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new
                        Intent(Intent.ACTION_VIEW, Uri.parse("http://eksheba.gov.bd"));
                startActivity(browserIntent);
            }
        });

        jonmoNibondhon = findViewById(R.id.jonmo_nibondhon);
        jonmoNibondhon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new
                        Intent(Intent.ACTION_VIEW, Uri.parse("http://br.lgd.gov.bd"));
                startActivity(browserIntent);
            }
        });


        inamjari = findViewById(R.id.inamjarir_abedon);
        inamjari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new
                        Intent(Intent.ACTION_VIEW, Uri.parse("http://land.gov.bd"));
                startActivity(browserIntent);
            }
        });


    }
}

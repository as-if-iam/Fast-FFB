package com.aslabs.main.fastffb;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class HelpAdvertisement extends AppCompatActivity {

    AdView adView,adView1,adView2,adView3,adView4,adView5,adView6,adView7,adView8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);if (Build.VERSION.SDK_INT < 16) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } else
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_help_advertisement);


        adView = (AdView)findViewById(R.id.adView);
        adView1 = (AdView)findViewById(R.id.adView1);
        adView2 = (AdView)findViewById(R.id.adView2);
        adView3 = (AdView)findViewById(R.id.adView3);
        adView4 = (AdView)findViewById(R.id.adView4);
        adView5 = (AdView)findViewById(R.id.adView5);
        adView6 = (AdView)findViewById(R.id.adView6);
        adView7 = (AdView)findViewById(R.id.adView7);
        adView8 = (AdView)findViewById(R.id.adView8);

        adView.setBackgroundColor(Color.TRANSPARENT);
        adView1.setBackgroundColor(Color.TRANSPARENT);
        adView2.setBackgroundColor(Color.TRANSPARENT);
        adView3.setBackgroundColor(Color.TRANSPARENT);
        adView4.setBackgroundColor(Color.TRANSPARENT);
        adView5.setBackgroundColor(Color.TRANSPARENT);
        adView6.setBackgroundColor(Color.TRANSPARENT);
        adView7.setBackgroundColor(Color.TRANSPARENT);
        adView8.setBackgroundColor(Color.TRANSPARENT);

        AdRequest adRequest = new AdRequest.Builder()
                .build();
        AdRequest adRequest1 = new AdRequest.Builder()
                .build();
        AdRequest adRequest2 = new AdRequest.Builder()
                .build();
        AdRequest adRequest3 = new AdRequest.Builder()
                .build();
        AdRequest adRequest4 = new AdRequest.Builder()
                .build();
        AdRequest adRequest5 = new AdRequest.Builder()
                .build();
        AdRequest adRequest6 = new AdRequest.Builder()
                .build();
        AdRequest adRequest7 = new AdRequest.Builder()
                .build();
        AdRequest adRequest8 = new AdRequest.Builder()
                .build();


        adView.loadAd(adRequest);
        adView1.loadAd(adRequest1);
        adView2.loadAd(adRequest2);
        adView3.loadAd(adRequest3);
        adView4.loadAd(adRequest4);
        adView5.loadAd(adRequest5);
        adView6.loadAd(adRequest6);
        adView7.loadAd(adRequest7);
        adView8.loadAd(adRequest8);
    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(HelpAdvertisement.this,Browser.class);
        startActivity(i);
        finish();
        super.onBackPressed();
    }
}

package com.citihoopla.ui;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.citihoopla.R;

public class SplashActivity extends ParentActivity {
    private Context mContext;
    private boolean isLogin = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        mContext = this;
        callNextScreen();
    }

    private void callNextScreen() {

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {

                Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        }, 2000);
    }

}

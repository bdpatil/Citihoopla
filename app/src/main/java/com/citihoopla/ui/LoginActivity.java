package com.citihoopla.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.widget.TextView;

import com.citihoopla.R;

/**
 * Created by Admin on 11-05-2016.
 */
public class LoginActivity extends ParentActivity {
   private Context mContext;
    CardView cv_Facebook,cv_Google;
    TextView txtSkip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mContext = this;
        initialize();
    }

    private void initialize() {
        cv_Facebook= (CardView) findViewById(R.id.cv_facebook);
        cv_Google= (CardView) findViewById(R.id.cv_googleplus);
        txtSkip= (TextView) findViewById(R.id.txt_skip);

    }

}

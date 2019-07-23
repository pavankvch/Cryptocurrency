package com.matic.network.home;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.matic.network.BaseActivity;
import com.matic.network.R;

public class HomeActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        init();
    }

    @Override
    protected void init() {

    }
}

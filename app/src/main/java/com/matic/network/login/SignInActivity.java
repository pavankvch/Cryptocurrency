package com.matic.network.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.matic.network.BaseActivity;
import com.matic.network.R;
import com.matic.network.home.HomeActivity;

public class SignInActivity extends BaseActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
    }

    @Override
    protected void init() {

        Button btnSignIn = findViewById(R.id.btnSignIn);

        btnSignIn.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.btnSignIn:
                startActivity(new Intent(SignInActivity.this, HomeActivity.class));
                break;
        }
    }
}

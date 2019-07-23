package com.matic.network;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

import com.matic.network.login.SignInActivity;
import com.matic.network.signup.SignUpActivity;

public class LoginSignUpActivity extends BaseActivity implements View.OnClickListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_signup);
        init();
    }

    @Override
    protected void init() {
        Button btnCreateAccount = findViewById(R.id.btnCreateAccount);
        Button btnSignIn = findViewById(R.id.btnSignIn);

        btnCreateAccount.setOnClickListener(this);
        btnSignIn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btnSignIn:
                startActivity(new Intent(LoginSignUpActivity.this, SignInActivity.class));
                break;

            case R.id.btnCreateAccount:
                startActivity(new Intent(LoginSignUpActivity.this, SignUpActivity.class));
                break;
        }
    }
}

package com.example.mohamed.smaplemvp.ui.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mohamed.smaplemvp.Application.MvpApp;
import com.example.mohamed.smaplemvp.R;
import com.example.mohamed.smaplemvp.Utils.CommonUtils;
import com.example.mohamed.smaplemvp.model.DataManager;
import com.example.mohamed.smaplemvp.presenter.login.LoginPresenter;
import com.example.mohamed.smaplemvp.ui.base.BaseActivity;
import com.example.mohamed.smaplemvp.ui.main.MainActivity;
import com.example.mohamed.smaplemvp.ui.splash.SplashActivity;
import com.example.mohamed.smaplemvp.view.login.LoginMvpView;

/**
 * Created by mohamed on 15/09/2017.
 */

public class LoginActivity extends BaseActivity implements LoginMvpView {

    private LoginPresenter mLoginPresenter;
    private EditText emailEditText;
    private EditText passwordEditText;
    private Button loginButton;

    public static Intent newIntent(Context context){
        Intent intent=new Intent(context,LoginActivity.class);

        return intent;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        emailEditText= (EditText) findViewById(R.id.email);
        passwordEditText= (EditText) findViewById(R.id.password);
        loginButton= (Button) findViewById(R.id.login);
        DataManager dataManager=((MvpApp) getApplication()).getDataManager();
        mLoginPresenter=new LoginPresenter(dataManager);
        mLoginPresenter.onAttach(this);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onLoginButtonClick();
            }
        });
    }

    @Override
    public void openMainActivity() {
        Intent intent = MainActivity.newIntent(this);
        startActivity(intent);
        finish();
    }

    @Override
    public void onLoginButtonClick() {
     String email=emailEditText.getText().toString();
        String password=passwordEditText.getText().toString();
        if (!CommonUtils.isEmailValid(email)){
            Toast.makeText(this, "Email is not correct", Toast.LENGTH_SHORT).show();
            return;
        }

        if (password==null || TextUtils.isEmpty(password)){
            Toast.makeText(this, "Password not be null", Toast.LENGTH_SHORT).show();
          return;
        }

        mLoginPresenter.startLogin(email);

    }

}

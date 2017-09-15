package com.example.mohamed.smaplemvp.ui.splash;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.mohamed.smaplemvp.Application.MvpApp;
import com.example.mohamed.smaplemvp.R;
import com.example.mohamed.smaplemvp.model.DataManager;
import com.example.mohamed.smaplemvp.presenter.splash.SplashPresenter;
import com.example.mohamed.smaplemvp.ui.base.BaseActivity;
import com.example.mohamed.smaplemvp.ui.login.LoginActivity;
import com.example.mohamed.smaplemvp.ui.main.MainActivity;
import com.example.mohamed.smaplemvp.view.splash.SplashMvpView;

/**
 * Created by mohamed on 15/09/2017.
 */

public class SplashActivity extends BaseActivity implements SplashMvpView {
    private SplashPresenter mSplashPresenter;

    public  static Intent newIntent(Context context){
        Intent intent=new Intent(context,SplashActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        DataManager dataManager = ((MvpApp) getApplication()).getDataManager();
        mSplashPresenter=new SplashPresenter(dataManager);
        mSplashPresenter.onAttach(this);

        mSplashPresenter.decideNextActivity();
    }

    @Override
    public void openMainActivity() {
        Intent intent = MainActivity.newIntent(this);
        startActivity(intent);
        finish();
    }

    @Override
    public void openLoginActivity() {
        Intent intent = LoginActivity.newIntent(this);
        startActivity(intent);
        finish();
    }
}

package com.example.mohamed.smaplemvp.ui.main;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mohamed.smaplemvp.Application.MvpApp;
import com.example.mohamed.smaplemvp.R;
import com.example.mohamed.smaplemvp.model.DataManager;
import com.example.mohamed.smaplemvp.presenter.main.MainPresenter;
import com.example.mohamed.smaplemvp.ui.base.BaseActivity;
import com.example.mohamed.smaplemvp.ui.splash.SplashActivity;
import com.example.mohamed.smaplemvp.view.main.MainMvpView;

/**
 * Created by mohamed on 15/09/2017.
 */

public class MainActivity extends BaseActivity implements MainMvpView {
    private TextView textView;
    private Button logout;
    private MainPresenter mainPresenter;

    public static Intent newIntent(Context context){
        Intent intent = new Intent(context, MainActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView= (TextView) findViewById(R.id.textView);
        logout= (Button) findViewById(R.id.logout);
        DataManager dataManager=((MvpApp) getApplication()).getDataManager();
        mainPresenter=new MainPresenter(dataManager);
        mainPresenter.onAttach(this);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainPresenter.setUserLoggedOut();
            }
        });
    }

    @Override
    public void openSplashActivity() {
        Intent intent = SplashActivity.newIntent(this);
        startActivity(intent);
        finish();
    }
}

package com.example.mohamed.smaplemvp.presenter.splash;

import com.example.mohamed.smaplemvp.model.DataManager;
import com.example.mohamed.smaplemvp.presenter.base.BasePresenter;
import com.example.mohamed.smaplemvp.presenter.splash.SplashMvpPresenter;
import com.example.mohamed.smaplemvp.view.splash.SplashMvpView;

/**
 * Created by mohamed on 15/09/2017.
 */

public class SplashPresenter<V extends SplashMvpView> extends BasePresenter<V> implements SplashMvpPresenter<V> {

    public SplashPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public void decideNextActivity() {
   if (getmDataManager().getLoggedInMode()){
       getmMvpView().openMainActivity();
   }else {
       getmMvpView().openLoginActivity();
   }
    }
}

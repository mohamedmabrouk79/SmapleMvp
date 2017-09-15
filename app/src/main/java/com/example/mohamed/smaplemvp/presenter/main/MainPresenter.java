package com.example.mohamed.smaplemvp.presenter.main;

import com.example.mohamed.smaplemvp.model.DataManager;
import com.example.mohamed.smaplemvp.presenter.base.BasePresenter;
import com.example.mohamed.smaplemvp.view.main.MainMvpView;

/**
 * Created by mohamed on 15/09/2017.
 */

public class MainPresenter<V extends MainMvpView> extends BasePresenter<V> implements MainMvpPresenter<V> {

    public MainPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public String getEmailId() {
        return getmDataManager().getEmailId();
    }

    @Override
    public void setUserLoggedOut() {
     getmDataManager().clear();
        getmMvpView().openSplashActivity();
    }
}

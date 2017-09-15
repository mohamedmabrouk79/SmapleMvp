package com.example.mohamed.smaplemvp.presenter.login;

import com.example.mohamed.smaplemvp.model.DataManager;
import com.example.mohamed.smaplemvp.presenter.base.BasePresenter;
import com.example.mohamed.smaplemvp.view.login.LoginMvpView;

/**
 * Created by mohamed on 15/09/2017.
 */

public class LoginPresenter<V extends LoginMvpView> extends BasePresenter<V> implements LoginMvpPresenter<V> {


    public LoginPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public void startLogin(String emailId) {
     getmDataManager().saveEmailId(emailId);
        getmDataManager().setLoggedIn();
        getmMvpView().openMainActivity();
    }
}

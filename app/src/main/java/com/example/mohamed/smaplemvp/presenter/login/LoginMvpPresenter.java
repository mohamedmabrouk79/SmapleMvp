package com.example.mohamed.smaplemvp.presenter.login;

import com.example.mohamed.smaplemvp.presenter.base.MvpPresenter;
import com.example.mohamed.smaplemvp.view.login.LoginMvpView;

/**
 * Created by mohamed on 15/09/2017.
 */

public interface LoginMvpPresenter<V extends LoginMvpView> extends MvpPresenter<V>{

    void startLogin(String emailId);

}

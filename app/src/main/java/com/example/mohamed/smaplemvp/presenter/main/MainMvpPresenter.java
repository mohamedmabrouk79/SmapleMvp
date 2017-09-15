package com.example.mohamed.smaplemvp.presenter.main;

import com.example.mohamed.smaplemvp.presenter.base.MvpPresenter;
import com.example.mohamed.smaplemvp.view.main.MainMvpView;

/**
 * Created by mohamed on 15/09/2017.
 */

public interface MainMvpPresenter<V extends MainMvpView> extends MvpPresenter<V> {
    String getEmailId();

    void setUserLoggedOut();

}

package com.example.mohamed.smaplemvp.presenter.splash;

import com.example.mohamed.smaplemvp.presenter.base.MvpPresenter;
import com.example.mohamed.smaplemvp.view.splash.SplashMvpView;

/**
 * Created by mohamed on 15/09/2017.
 */

public interface SplashMvpPresenter<V extends SplashMvpView> extends MvpPresenter<V> {
    void decideNextActivity();

}

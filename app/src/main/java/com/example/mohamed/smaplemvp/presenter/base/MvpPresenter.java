package com.example.mohamed.smaplemvp.presenter.base;

import com.example.mohamed.smaplemvp.view.MvpView;

/**
 * Created by mohamed on 15/09/2017.
 */

public interface MvpPresenter<V extends MvpView> {
    void onAttach(V mvpView);
}

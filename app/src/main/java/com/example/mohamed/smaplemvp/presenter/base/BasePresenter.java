package com.example.mohamed.smaplemvp.presenter.base;

import com.example.mohamed.smaplemvp.model.DataManager;
import com.example.mohamed.smaplemvp.view.MvpView;

/**
 * Created by mohamed on 15/09/2017.
 */

public class BasePresenter<V extends MvpView> implements MvpPresenter<V> {
    private V mMvpView;
    DataManager mDataManager;

    public BasePresenter(DataManager dataManager){
        mDataManager=dataManager;
    }
    @Override
    public void onAttach(V mvpView) {
     mMvpView=mvpView;
    }

    public DataManager getmDataManager() {
        return mDataManager;
    }

    public V getmMvpView() {
        return mMvpView;
    }
}

package com.example.mohamed.smaplemvp.Application;

import android.app.Application;

import com.example.mohamed.smaplemvp.model.DataManager;
import com.example.mohamed.smaplemvp.model.SharedPrefsHelper;

/**
 * Created by mohamed on 15/09/2017.
 */

public class MvpApp extends Application {
    DataManager dataManager;

    @Override
    public void onCreate() {
        super.onCreate();
        SharedPrefsHelper sharedPrefsHelper=new SharedPrefsHelper(getApplicationContext());
        dataManager=new DataManager(sharedPrefsHelper);
    }

    public DataManager getDataManager(){
        return dataManager;
    }
}

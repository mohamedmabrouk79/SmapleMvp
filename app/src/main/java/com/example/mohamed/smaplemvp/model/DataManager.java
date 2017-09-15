package com.example.mohamed.smaplemvp.model;

/**
 * Created by mohamed on 15/09/2017.
 */

public class DataManager {
    SharedPrefsHelper mSharedPrefsHelper;

    public DataManager(SharedPrefsHelper sharedPrefsHelper) {
        mSharedPrefsHelper = sharedPrefsHelper;
    }

    public void clear() {
        mSharedPrefsHelper.Clear();
    }

    public void saveEmailId(String email) {
        mSharedPrefsHelper.PutEmail(email);
    }

    public String getEmailId() {
        return mSharedPrefsHelper.getEmail();
    }

    public void setLoggedIn() {
        mSharedPrefsHelper.setLoggedInMode(true);
    }

    public Boolean getLoggedInMode() {
        return mSharedPrefsHelper.getLoggedInMode();
    }
}

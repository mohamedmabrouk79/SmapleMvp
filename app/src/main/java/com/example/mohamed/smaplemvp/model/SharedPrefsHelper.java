package com.example.mohamed.smaplemvp.model;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by mohamed on 14/09/2017.
 */

public class SharedPrefsHelper {
    private SharedPreferences mSharedPreferences;
    public static final String MY_PREFS = "MY_PREFS";
    public static final String EMAIL = "EMAIL";

    public SharedPrefsHelper(Context context){
     mSharedPreferences=context.getSharedPreferences(MY_PREFS,Context.MODE_PRIVATE);
    }

    public void Clear(){
        mSharedPreferences.edit().clear().apply();
    }

    public void PutEmail(String email){
        mSharedPreferences.edit().putString(EMAIL,email).apply();
    }

    public String getEmail(){
        return mSharedPreferences.getString(EMAIL,null);
    }

    public boolean getLoggedInMode() {
        return mSharedPreferences.getBoolean("IS_LOGGED_IN", false);
    }

    public void setLoggedInMode(boolean loggedIn) {
        mSharedPreferences.edit().putBoolean("IS_LOGGED_IN", loggedIn).apply();
    }


}

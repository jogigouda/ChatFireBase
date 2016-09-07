package com.google.firebase.quickstart.database.App;

import android.app.Application;
import android.content.Context;
import android.util.Log;

/**
 * Class to track
 */
public class FirebaseTrackerApp extends Application {

    private static final String TAG = "Application";
    static Context globalContext;

    @Override
    public void onCreate() {
        super.onCreate();
        globalContext = getApplicationContext();
        Log.d(TAG, "onCreate called");
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        Log.d(TAG, "onTerminate called");
    }

    public static Context getGlobalContext() {
        return globalContext;
    }
}

package com.example.a1718033_tareh;

import android.app.Application;
import android.content.Context;

import com.example.a1718033_tareh.helper.LocaleHelper;

public class MainApplication extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(LocaleHelper.onAttach(base,"en"));
    }
}

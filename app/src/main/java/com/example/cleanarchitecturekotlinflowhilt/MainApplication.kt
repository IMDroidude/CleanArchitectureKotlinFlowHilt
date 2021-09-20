package com.example.cleanarchitecturekotlinflowhilt

import android.app.Application
import com.example.core_android.base.PBApplication
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MainApplication : PBApplication() {

    override fun onCreate() {
        super.onCreate()

        // FIXME: 17/09/2021 add Crashlytics and Timber
        //Where Crashlytics require to create an app on Firebase
    }
}
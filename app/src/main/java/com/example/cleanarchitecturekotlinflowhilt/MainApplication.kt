package com.example.cleanarchitecturekotlinflowhilt

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        // FIXME: 17/09/2021 add Crashlytics and Timber
        //Where Crashlytics require to create an app on Firebase
    }
}
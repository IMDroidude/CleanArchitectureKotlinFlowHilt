package com.example.core_android.base

import android.app.Application

abstract class PBApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        //add Strict Mode
        // timber
        // Analytics
        // Initialize add if require...
    }
}
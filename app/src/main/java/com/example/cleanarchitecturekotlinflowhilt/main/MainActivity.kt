package com.example.cleanarchitecturekotlinflowhilt.main

import android.os.Bundle
import androidx.activity.viewModels
import com.example.cleanarchitecturekotlinflowhilt.R
import com.example.core_android.base.PBActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : PBActivity() {
    private val mViewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        doInScope {
            mViewModel.test()
        }

    }
}
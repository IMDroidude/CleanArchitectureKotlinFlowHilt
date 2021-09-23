package com.example.cleanarchitecturekotlinflowhilt.main

import android.os.Bundle
import androidx.activity.viewModels
import com.example.cleanarchitecturekotlinflowhilt.R
import com.example.cleanarchitecturekotlinflowhilt.databinding.ActivityMainBinding
import com.example.cleanarchitecturekotlinflowhilt.databinding.ActivitySplashBinding
import com.example.core_android.base.PBActivity
import com.hi.dhl.binding.databind
import com.hi.dhl.binding.viewbind
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : PBActivity(R.layout.activity_main) {
    ///private val binding by viewBinding<
    val binding: ActivityMainBinding by viewbind()
    val dataBinding: ActivityMainBinding by databind(R.layout.activity_main)
    private val mViewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dataBinding.test = "Ckcick Me I am"
        dataBinding.titleTv.setOnClickListener {
            ///binding.titleTv.setText("Hello")
            dataBinding.test = "Hello"
        }
        doInScope {
            mViewModel.test()
        }

        /*mViewModel.mLiveData.observe(this,{

        })*/

    }
}
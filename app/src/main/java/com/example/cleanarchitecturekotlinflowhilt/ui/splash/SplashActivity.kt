package com.example.cleanarchitecturekotlinflowhilt.ui.splash

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.example.cleanarchitecturekotlinflowhilt.R
import com.example.cleanarchitecturekotlinflowhilt.databinding.ActivitySplashBinding
import com.example.core_android.base.PBActivity
import com.hi.dhl.binding.viewbind
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SplashActivity : PBActivity(R.layout.activity_splash) {

    // https://github.com/hi-dhl/Binding
    val binding: ActivitySplashBinding by viewbind()
    private val mViewModel:SplashViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /*mViewModel.splashAction.observe(this,{
          when(it){
              is SplashViewModel.SplashAction.ScreenToView -> {
                  startActivity(Intent(this@SplashActivity,it.className))
              }
              is SplashViewModel.SplashAction.ShowToast -> {

              }
          }
        })*/
        mViewModel.screenSelectionUsingFlow().observe(this,{
            startActivity(Intent(this@SplashActivity,it.java))
        })
    }
}
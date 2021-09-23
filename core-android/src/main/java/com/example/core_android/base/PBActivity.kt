package com.example.core_android.base

import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import kotlinx.coroutines.launch

abstract class PBActivity(@LayoutRes contentLayoutID:Int) : AppCompatActivity(contentLayoutID) {
    protected fun doInScope(
        state: Lifecycle.State = Lifecycle.State.STARTED,
        action: suspend () -> Unit
    ) {
        lifecycleScope.launch{
            lifecycle.repeatOnLifecycle(state){
                action()
            }
        }
    }
}
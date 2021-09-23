package com.example.core_android.base

import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import kotlinx.coroutines.launch

abstract class PBFragment(@LayoutRes contentLayoutID:Int) : Fragment(contentLayoutID) {


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
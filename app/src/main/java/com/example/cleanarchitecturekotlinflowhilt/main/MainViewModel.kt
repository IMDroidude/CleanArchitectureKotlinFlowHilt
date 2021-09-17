package com.example.cleanarchitecturekotlinflowhilt.main

import androidx.lifecycle.ViewModel
import com.example.core.prefs.PrefStore
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val prefStore: PrefStore
): ViewModel(){

    fun test():Boolean{
        prefStore.saveBoolean("hello",true)
        return prefStore.getBoolean("hello")
    }
}
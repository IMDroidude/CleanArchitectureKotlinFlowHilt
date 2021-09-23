package com.example.cleanarchitecturekotlinflowhilt.ui.splash

import androidx.lifecycle.LiveData
import androidx.lifecycle.asLiveData
import androidx.lifecycle.liveData
import androidx.lifecycle.viewModelScope
import com.example.cleanarchitecturekotlinflowhilt.main.MainActivity
import com.example.core.prefs.PrefStore
import com.example.core_android.base.PBViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.flow
import javax.inject.Inject
import kotlin.reflect.KClass

@HiltViewModel
class SplashViewModel @Inject constructor(
    private val prefStore: PrefStore
):PBViewModel() {

    val splashAction:LiveData<SplashAction> = liveData {
        emit(SplashAction.ScreenToView(MainActivity::class.java))
    }

    fun screenSelectionUsingFlow():LiveData<KClass<*>> = flow {
        kotlinx.coroutines.delay(2000)
        emit(MainActivity::class)
    }.asLiveData(viewModelScope.coroutineContext)


    sealed class SplashAction {
        class ScreenToView(val className: Class<*>) : SplashAction()
        class ShowToast(val title:String):SplashAction()
        ///class NetworkErro(val errorMessage):SplashCommand()
    }
}
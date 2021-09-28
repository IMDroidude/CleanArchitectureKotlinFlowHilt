package com.example.cleanarchitecturekotlinflowhilt.ui.splash

import androidx.lifecycle.LiveData
import androidx.lifecycle.asLiveData
import androidx.lifecycle.liveData
import androidx.lifecycle.viewModelScope
import com.example.cleanarchitecturekotlinflowhilt.main.MainActivity
import com.example.cleanarchitecturekotlinflowhilt.ui.home.HomeActivity
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

    val screenToView:LiveData<SplashAction> = flow {
        kotlinx.coroutines.delay(1000)
        emit(SplashAction.ScreenToView(HomeActivity::class.java))
    }.asLiveData(viewModelScope.coroutineContext)

    /*fun screenSelectionUsingFlow():LiveData<KClass<*>> = flow {
        kotlinx.coroutines.delay(2000)
        emit(HomeActivity::class)
    }.asLiveData(viewModelScope.coroutineContext)*/

    sealed class SplashAction {
        class ScreenToView(val className: Class<*>) : SplashAction()
        class ShowToast(val title:String):SplashAction()
        ///class NetworkErro(val errorMessage):SplashCommand()
    }
}
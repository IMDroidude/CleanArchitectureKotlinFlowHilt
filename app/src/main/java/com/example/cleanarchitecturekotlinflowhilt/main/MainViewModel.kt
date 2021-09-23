package com.example.cleanarchitecturekotlinflowhilt.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.core.prefs.PrefStore
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val prefStore: PrefStore///,
    ///private val fetchQuestionUseCase: FetchQuestionUseCase
): ViewModel(){

    fun test():Boolean{
        prefStore.saveBoolean("hello",true)
        return prefStore.getBoolean("hello")
    }

    ///val mLiveData  = fetchQuestionUseCase.fetchContactInfo().asLiveData(viewModelScope.coroutineContext)
    fun newTest()= viewModelScope.launch {
        /*fetchQuestionUseCase.fetchContactInfo().onStart {

        }.catch {

        }.collect {

        }*/
    }
    ///val x = fetchQuestionUseCase.fetchContactInfo()
}
package com.example.cleanarchitecturekotlinflowhilt.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.example.core.prefs.PrefStore
import com.example.domain.usecase.FetchQuestionUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.onStart
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
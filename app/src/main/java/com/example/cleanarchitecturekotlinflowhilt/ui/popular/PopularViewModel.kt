package com.example.cleanarchitecturekotlinflowhilt.ui.popular

import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.example.core.prefs.response.Resource
import com.example.core_android.base.PBViewModel
import com.example.domain.model.MoviesResponse
import com.example.domain.usecase.GetPopularMoviesUseCase
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class PopularViewModel @Inject constructor(
    private val getPopularMoviesUseCase: GetPopularMoviesUseCase
):PBViewModel() {

    fun fetchPopularMovies()=  flow<Resource<MoviesResponse>> {
        getPopularMoviesUseCase.execute(0)
    }.asLiveData(viewModelScope.coroutineContext)

}
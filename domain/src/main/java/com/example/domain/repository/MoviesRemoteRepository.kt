package com.example.domain.repository

import com.example.core.prefs.response.Resource
import com.example.domain.model.MoviesResponse
import kotlinx.coroutines.flow.Flow

interface MoviesRemoteRepository {

    fun getPopularMovies(page: Int):Flow<Resource<MoviesResponse>>
}
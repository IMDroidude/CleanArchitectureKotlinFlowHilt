package com.example.data.repository

import com.example.core.prefs.response.Resource
import com.example.domain.model.MoviesResponse
import com.example.domain.repository.MoviesRemoteRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class MoviesRemoteRepositoryImpl @Inject constructor(

): MoviesRemoteRepository {
    override fun getPopularMovies(page: Int): Flow<Resource<MoviesResponse>> {
        TODO("Not yet implemented")
    }
}
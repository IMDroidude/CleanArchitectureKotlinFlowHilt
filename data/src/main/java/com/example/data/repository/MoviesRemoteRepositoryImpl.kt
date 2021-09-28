package com.example.data.repository

import com.example.core.prefs.response.Resource
import com.example.data.remote.datasource.MovieRemoteDataSource
import com.example.domain.model.MoviesResponse
import com.example.domain.repository.MoviesRemoteRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class MoviesRemoteRepositoryImpl @Inject constructor(
    private val movieRemoteDataSource: MovieRemoteDataSource
): MoviesRemoteRepository {

    override fun getPopularMovies(page: Int): Flow<Resource<MoviesResponse>> = flow {
        emit(Resource.loading())
        emit(Resource.success(movieRemoteDataSource.getMovieResponse()))
    }
}
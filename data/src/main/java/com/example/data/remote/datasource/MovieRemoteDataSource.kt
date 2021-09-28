package com.example.data.remote.datasource

import com.example.data.netwrok.MovieService
import com.example.domain.model.MoviesResponse
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class MovieRemoteDataSource @Inject constructor(
    private val movieService: MovieService
) {

    suspend fun getMovieResponse(): MoviesResponse = movieService.getPopularMovies(0)
}
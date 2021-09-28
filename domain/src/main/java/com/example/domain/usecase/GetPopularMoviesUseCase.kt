package com.example.domain.usecase

import com.example.core.prefs.response.Resource
import com.example.domain.model.MoviesResponse
import com.example.domain.repository.MoviesRemoteRepository
import kotlinx.coroutines.flow.Flow

class GetPopularMoviesUseCase(private val moviesRemoteRepository: MoviesRemoteRepository) {

    fun execute(page: Int): Flow<Resource<MoviesResponse>> {
        return moviesRemoteRepository.getPopularMovies(page)
    }

}
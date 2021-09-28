package com.example.data.netwrok

import com.example.domain.model.MoviesResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MovieService {

    @GET("movie/popular")
    suspend fun getPopularMovies(@Query("page") page: Int): MoviesResponse

    @GET("movie/upcoming")
    fun getUpcomingMovies(@Query("page") page: Int): MoviesResponse

    @GET("movie/{id}")
    fun getSingleMovie(@Path("id") id: String): MoviesResponse
}
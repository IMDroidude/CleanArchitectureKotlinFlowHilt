package com.example.data.model

data class MoviesResponseEntity (
    val page : Int,
    val total_results : Int,
    val total_pages : Int,
    val results : List<MovieEntity>
)
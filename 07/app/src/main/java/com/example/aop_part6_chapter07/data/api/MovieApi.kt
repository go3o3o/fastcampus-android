package com.example.aop_part6_chapter07.data.api

import com.example.aop_part6_chapter07.domain.model.Movie

interface MovieApi {

    suspend fun getAllMovies(): List<Movie>
}
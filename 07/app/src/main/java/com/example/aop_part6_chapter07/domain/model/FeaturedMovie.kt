package com.example.aop_part6_chapter07.domain.model

data class FeaturedMovie(
    val movie: Movie,
    val latestReview: Review?
)
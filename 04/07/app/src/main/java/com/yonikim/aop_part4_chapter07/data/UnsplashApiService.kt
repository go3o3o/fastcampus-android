package com.yonikim.aop_part4_chapter07.data

import com.yonikim.aop_part4_chapter07.BuildConfig
import com.yonikim.aop_part4_chapter07.data.models.PhotoResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface UnsplashApiService {

    @GET(
        "photos/random?" +
                "client_id=${BuildConfig.UNSPLASH_ACESS_KEY}" +
                "&count=30"
    )
    suspend fun getRandomPhotos(
        @Query("query") query: String?
    ): Response<List<PhotoResponse>>
}
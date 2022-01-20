package com.yonikim.aop_part6_chapter01.data.repository.restaurant

import com.yonikim.aop_part6_chapter01.data.entity.location.LocationLatLngEntity
import com.yonikim.aop_part6_chapter01.data.entity.restaurant.RestaurantEntity

interface RestaurantRepository {

    suspend fun getList(
        restaurantCategory: RestaurantCategory,
        locationLatLngEntity: LocationLatLngEntity
    ): List<RestaurantEntity>

}
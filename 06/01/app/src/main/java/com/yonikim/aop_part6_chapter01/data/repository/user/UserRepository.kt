package com.yonikim.aop_part6_chapter01.data.repository.user

import com.yonikim.aop_part6_chapter01.data.entity.location.LocationLatLngEntity
import com.yonikim.aop_part6_chapter01.data.entity.restaurant.RestaurantEntity

interface UserRepository {

    suspend fun getUserLocation(): LocationLatLngEntity?

    suspend fun insertUserLocation(locationLatLngEntity: LocationLatLngEntity)

    suspend fun getUserLikedRestaurant(restaurantTitle: String): RestaurantEntity?

    suspend fun getAllUserLikedRestaurant(): List<RestaurantEntity>

    suspend fun insertUserLikedRestaurant(restaurantEntity: RestaurantEntity)

    suspend fun deleteUserLikedRestaurant(restaurantTitle: String)

    suspend fun deleteALlUserLikedRestaurant()

}

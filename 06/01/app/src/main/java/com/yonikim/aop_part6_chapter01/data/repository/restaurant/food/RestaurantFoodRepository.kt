package com.yonikim.aop_part6_chapter01.data.repository.restaurant.food

import com.yonikim.aop_part6_chapter01.data.entity.restaurant.RestaurantFoodEntity

interface RestaurantFoodRepository {
    suspend fun getFoods(restaurantId: Long, restaurantTitle: String): List<RestaurantFoodEntity>

    suspend fun getAllFoodMenuListInBasket(): List<RestaurantFoodEntity>

    suspend fun getFoodMenuListInBasket(restaurantId: Long): List<RestaurantFoodEntity>

    suspend fun insertFoodMenuInBasket(restaurantFoodEntity: RestaurantFoodEntity)

    suspend fun removeFoodMenuListInBasket(foodId: String)

    suspend fun clearFoodMenuListInBasket()
}
package com.yonikim.aop_part6_chapter01.data.entity.order

import com.yonikim.aop_part6_chapter01.data.entity.restaurant.RestaurantFoodEntity

data class OrderEntity(
    val id: String,
    val userId: String,
    val restaurantId: Long,
    val foodMenuList: List<RestaurantFoodEntity>,
    val restaurantTitle: String
)

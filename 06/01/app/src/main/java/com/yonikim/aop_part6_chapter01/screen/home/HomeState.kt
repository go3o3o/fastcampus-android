package com.yonikim.aop_part6_chapter01.screen.home

import androidx.annotation.StringRes
import com.yonikim.aop_part6_chapter01.data.entity.location.MapSearchInfoEntity
import com.yonikim.aop_part6_chapter01.data.entity.restaurant.RestaurantFoodEntity

sealed class HomeState {
    object Uninitialized: HomeState()

    object Loading: HomeState()

    data class Success(
        val mapSearchInfoEntity: MapSearchInfoEntity,
        val isLocationSame: Boolean,
        val foodMenuListInBasket: List<RestaurantFoodEntity>? = null
    ): HomeState()

    data class Error(
        @StringRes val messageId: Int
    ): HomeState()
}
package com.yonikim.aop_part6_chapter01.screen.like

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.yonikim.aop_part6_chapter01.data.entity.restaurant.RestaurantEntity
import com.yonikim.aop_part6_chapter01.data.repository.user.UserRepository
import com.yonikim.aop_part6_chapter01.model.CellType
import com.yonikim.aop_part6_chapter01.model.restaurant.RestaurantModel
import com.yonikim.aop_part6_chapter01.screen.base.BaseViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

class RestaurantLikeListViewModel(
    private val userRepository: UserRepository
): BaseViewModel() {

    val restaurantListLiveData = MutableLiveData<List<RestaurantModel>>()

    override fun fetchData(): Job = viewModelScope.launch {
        restaurantListLiveData.value = userRepository.getAllUserLikedRestaurant().map {
            RestaurantModel(
                id = it.id,
                type = CellType.LIKE_RESTAURANT_CELL,
                restaurantInfoId = it.restaurantInfoId,
                restaurantCategory = it.restaurantCategory,
                restaurantTitle = it.restaurantTitle,
                restaurantImageUrl = it.restaurantImageUrl,
                grade = it.grade,
                reviewCount = it.reviewCount,
                deliveryTimeRange = it.deliveryTimeRange,
                deliveryTipRange = it.deliveryTipRange,
                restaurantTelNumber = it.restaurantTelNumber,
            )
        }
    }

    fun dislikeRestaurant(restaurantEntity: RestaurantEntity) = viewModelScope.launch {
        userRepository.deleteUserLikedRestaurant(restaurantEntity.restaurantTitle)
        fetchData()
    }

}
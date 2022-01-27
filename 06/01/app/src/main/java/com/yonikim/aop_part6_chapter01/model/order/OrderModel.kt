package com.yonikim.aop_part6_chapter01.model.order

import com.yonikim.aop_part6_chapter01.data.entity.order.OrderEntity
import com.yonikim.aop_part6_chapter01.data.entity.restaurant.RestaurantFoodEntity
import com.yonikim.aop_part6_chapter01.model.CellType
import com.yonikim.aop_part6_chapter01.model.Model

data class OrderModel(
    override val id: Long,
    override val type: CellType = CellType.ORDER_CELL,
    val orderId: String,
    val userId: String,
    val restaurantId: Long,
    val foodMenuList: List<RestaurantFoodEntity>,
    val restaurantTitle: String
): Model(id, type) {

    fun toEntity() = OrderEntity(
        id = orderId,
        userId = userId,
        restaurantId = restaurantId,
        foodMenuList = foodMenuList,
        restaurantTitle = restaurantTitle
    )

}

package com.yonikim.aop_part6_chapter01.widget.adapter.listener.order

import com.yonikim.aop_part6_chapter01.model.restaurant.FoodModel
import com.yonikim.aop_part6_chapter01.widget.adapter.listener.AdapterListener

interface OrderMenuListListener: AdapterListener {

    fun onRemoveItem(model: FoodModel)

}
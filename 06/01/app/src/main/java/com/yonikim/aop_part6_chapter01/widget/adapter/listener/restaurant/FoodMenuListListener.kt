package com.yonikim.aop_part6_chapter01.widget.adapter.listener.restaurant

import com.yonikim.aop_part6_chapter01.model.restaurant.FoodModel
import com.yonikim.aop_part6_chapter01.widget.adapter.listener.AdapterListener

interface FoodMenuListListener: AdapterListener {

    fun onClickItem(model: FoodModel)

}
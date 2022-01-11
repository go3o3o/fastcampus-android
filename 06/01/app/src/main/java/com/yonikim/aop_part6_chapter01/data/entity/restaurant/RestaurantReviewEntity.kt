package com.yonikim.aop_part6_chapter01.data.entity.restaurant

import android.net.Uri
import com.yonikim.aop_part6_chapter01.data.entity.Entity

data class RestaurantReviewEntity(
    override val id: Long,
    val title: String,
    val description: String,
    val grade: Int,
    val images: List<Uri>? = null
): Entity
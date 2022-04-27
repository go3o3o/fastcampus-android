package com.yonikim.aop_part6_chapter01.screen.mylocation

import com.yonikim.aop_part6_chapter01.data.entity.location.MapSearchInfoEntity

sealed class MyLocationState {

    object Uninitialized: MyLocationState()

    object Loading: MyLocationState()

    data class Success(
        val mapSearchInfoEntity: MapSearchInfoEntity
    ): MyLocationState()

    data class Confirm(
        val mapSearchInfoEntity: MapSearchInfoEntity
    ): MyLocationState()

}
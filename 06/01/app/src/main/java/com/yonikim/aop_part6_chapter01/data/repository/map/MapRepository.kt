package com.yonikim.aop_part6_chapter01.data.repository.map

import com.yonikim.aop_part6_chapter01.data.entity.location.LocationLatLngEntity

interface MapRepository {
    suspend fun getReverseGeoInformation(
        locationLatLngEntity: LocationLatLngEntity
    ): AddressInfo?
}
package com.yonikim.aop_part6_chapter01.data.repository.map

import com.yonikim.aop_part6_chapter01.data.entity.location.LocationLatLngEntity
import com.yonikim.aop_part6_chapter01.data.network.MapApiService
import com.yonikim.aop_part6_chapter01.data.response.address.AddressInfo
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext

class DefaultMapRepository(
    private val mapApiService: MapApiService,
    private val ioDispatcher: CoroutineDispatcher
): MapRepository {
    override suspend fun getReverseGeoInformation(
        locationLatLngEntity: LocationLatLngEntity
    ): AddressInfo? = withContext(ioDispatcher) {
        val response = mapApiService.getReverseGeoCode(
            lat = locationLatLngEntity.latitude,
            lon = locationLatLngEntity.longitude
        )
        if (response.isSuccessful) {
            response.body()?.addressInfo
        } else {
            null
        }
    }
}
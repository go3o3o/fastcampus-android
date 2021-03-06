package com.yonikim.aop_part5_chapter05.data.db.entity.mapper

import com.yonikim.aop_part5_chapter05.data.db.entity.StationEntity
import com.yonikim.aop_part5_chapter05.data.db.entity.StationWithSubwaysEntity
import com.yonikim.aop_part5_chapter05.data.db.entity.SubwayEntity
import com.yonikim.aop_part5_chapter05.domain.Station
import com.yonikim.aop_part5_chapter05.domain.Subway

fun StationWithSubwaysEntity.toStation() =
    Station(
        name = station.stationName,
        isFavorited = station.isFavorited,
        connectedSubways = subways.toSubways()
    )

fun Station.toStationEntity() =
    StationEntity(
        stationName = name,
        isFavorited = isFavorited
    )

fun List<StationWithSubwaysEntity>.toStations() = map { it.toStation() }

fun List<SubwayEntity>.toSubways(): List<Subway> = map { Subway.findById(it.subwayId) }
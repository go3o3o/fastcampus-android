package com.yonikim.aop_part6_chapter01.data.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.yonikim.aop_part6_chapter01.data.entity.location.LocationLatLngEntity

@Dao
interface LocationDao {

    @Query("SELECT * FROM LocationLatLngEntity WHERE id=:id")
    suspend fun get(id: Long): LocationLatLngEntity?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(locationLatLngEntity: LocationLatLngEntity)

    @Query("DELETE FROM LocationLatLngEntity WHERE id=:id")
    suspend fun delete(id: Long)
}
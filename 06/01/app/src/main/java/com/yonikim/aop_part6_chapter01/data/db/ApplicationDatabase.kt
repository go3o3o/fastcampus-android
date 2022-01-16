package com.yonikim.aop_part6_chapter01.data.db

import androidx.room.RoomDatabase
import com.yonikim.aop_part6_chapter01.data.db.dao.FoodMenuBasketDao
import com.yonikim.aop_part6_chapter01.data.db.dao.LocationDao
import com.yonikim.aop_part6_chapter01.data.db.dao.RestaurantDao

abstract class ApplicationDatabase : RoomDatabase() {
    companion object {
        const val DB_NAME = "ApplicationDataBase.db"
    }

    abstract fun LocationDao(): LocationDao

    abstract fun FoodMenuBasketDao(): FoodMenuBasketDao

    abstract fun RestaurantDao(): RestaurantDao

}
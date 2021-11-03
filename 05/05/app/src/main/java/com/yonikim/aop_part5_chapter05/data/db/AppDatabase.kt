package com.yonikim.aop_part5_chapter05.data.db

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.yonikim.aop_part5_chapter05.data.db.entity.StationDao

abstract class AppDatabase : RoomDatabase() {

    abstract fun stationDao(): StationDao

    companion object {
        private const val DATABASE_NAME = "station.db"

        fun bind(context: Context): AppDatabase =
            Room.databaseBuilder(context, AppDatabase::class.java, DATABASE_NAME).build()
    }


}
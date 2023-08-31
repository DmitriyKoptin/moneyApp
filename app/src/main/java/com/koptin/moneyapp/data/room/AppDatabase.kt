package com.koptin.moneyapp.data.room

import androidx.room.RoomDatabase

abstract class AppDatabase: RoomDatabase() {
    abstract fun moneyDao(): MoneyDao
}
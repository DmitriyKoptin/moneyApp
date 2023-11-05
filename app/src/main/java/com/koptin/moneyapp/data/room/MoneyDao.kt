package com.koptin.moneyapp.data.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

@Dao
interface MoneyDao {

    @Query("SELECT * FROM money")
    fun getAllDbItems(): Flow<List<Money>>

    @Upsert(entity = Money::class)
    suspend fun insert(money: NewMoney)

    @Delete
    suspend fun delete(money: NewMoney)
}
package com.koptin.moneyapp.data.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface MoneyDao {

    @Query("SELECT * FROM money")
    fun getAllDbItems(): Flow<List<Money>>

    @Insert(entity = Money::class)
    suspend fun insert(money: NewMoney)
}
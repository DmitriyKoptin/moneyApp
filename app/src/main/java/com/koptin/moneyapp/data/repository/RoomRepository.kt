package com.koptin.moneyapp.data.repository

import com.koptin.moneyapp.data.room.Money
import com.koptin.moneyapp.data.room.MoneyDao
import com.koptin.moneyapp.data.room.NewMoney
import kotlinx.coroutines.flow.Flow

class RoomRepository(private val moneyDao: MoneyDao) {
    fun getAllMoneyList(): Flow<List<Money>> {
        return moneyDao.getAllDbItems()
    }

    suspend fun upsertMoneyItem(money: NewMoney) {
        moneyDao.insert(money)
    }

    suspend fun deleteLastMoneyItem(money: NewMoney) {
        moneyDao.delete(money)
    }
}
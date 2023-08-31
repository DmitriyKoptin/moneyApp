package com.koptin.moneyapp.data.room

import androidx.room.ColumnInfo
import androidx.room.PrimaryKey

data class NewMoney (
    @PrimaryKey
    @ColumnInfo(name = "id")
    val id: Int? = null,
    @ColumnInfo(name = "date")
    val date: Int,
    @ColumnInfo(name = "money")
    val money: Int
)
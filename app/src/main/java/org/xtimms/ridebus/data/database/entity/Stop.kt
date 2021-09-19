package org.xtimms.ridebus.data.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

//
// Created by Xtimms on 01.09.2021.
//
@Entity(tableName = "Stops")
data class Stop(
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "_id")
    val stopId: Int,
    @ColumnInfo(name = "city_id") val cityId: Int,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "direction") val direction: String,
    @ColumnInfo(name = "latitude") val latitude: Float,
    @ColumnInfo(name = "longitude") val longitude: Float
)

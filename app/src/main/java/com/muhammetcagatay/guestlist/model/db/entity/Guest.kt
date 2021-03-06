package com.cagataymuhammet.guestlist.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by Muhammet ÇAĞATAY on 15,Şubat,2020
 */

/*
            "first_name": "Smith",
            "last_name": "Abe",
            "id": 32363960,
            "company": "Boomset",
            "job_title": null
 */

@Entity(tableName = "guests")
data class Guest(@ColumnInfo(name = "first_name") var first_name: String?,
                 @ColumnInfo(name = "last_name") var last_name: String?,
                 @ColumnInfo(name = "company") var company: String?,
                 @ColumnInfo(name = "event") var event: Int?,
                 @ColumnInfo(name = "job_title") var job_title: String?) {
    @PrimaryKey(autoGenerate = true)
    var uid: Int = 0

}

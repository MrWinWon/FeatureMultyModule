package ru.mrwinwon.data

import androidx.room.Entity

@Entity(tableName = "user")
data class UserLocal(val id: Long)

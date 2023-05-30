package ru.mrwinwon.core_db

import android.content.Context
import androidx.room.*
import androidx.sqlite.db.SupportSQLiteOpenHelper
import ru.mrwinwon.core_db.FeatureMultiModuleDB.Companion.DATA_BASE_VERSION
import ru.mrwinwon.data.UserLocal

@Database(entities = [UserLocal::class], version = DATA_BASE_VERSION)
class FeatureMultiModuleDB : RoomDatabase() {

    @Volatile
    private var instance: FeatureMultiModuleDB? = null

    override fun createOpenHelper(config: DatabaseConfiguration?): SupportSQLiteOpenHelper {
        TODO("Not yet implemented")
    }

    override fun createInvalidationTracker(): InvalidationTracker {
        TODO("Not yet implemented")
    }

    override fun clearAllTables() {
        TODO("Not yet implemented")
    }

    @Synchronized
    fun getInstance(context: Context): FeatureMultiModuleDB? {
        if (instance == null) {
            instance = create(context)
        }
        return instance
    }

    private fun create(context: Context): FeatureMultiModuleDB {
        return Room
            .databaseBuilder(
                context,
                FeatureMultiModuleDB::class.java,
                DATA_BASE_NAME
            )
            .build()
    }

    companion object {
        const val DATA_BASE_VERSION = 1
        const val DATA_BASE_NAME = "FeatureMultiModuleDB"
    }
}
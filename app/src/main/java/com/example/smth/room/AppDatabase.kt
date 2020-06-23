package com.example.smth.room
/*

import android.content.Context
import android.renderscript.Element
import androidx.room.*
import java.security.AccessControlContext
import javax.xml.datatype.DatatypeConfigurationException

@Database(entities = [Result::class],version = 1)
public abstract class AppDatabase : RoomDatabase(){

    abstract fun movieDao(): MovieDao
    companion object{
        @Volatile
        private var INSTANCE: AppDatabase?= null

        fun getDatabase(context: Context) : AppDatabase
        {
            val tempInstance = INSTANCE
            if (tempInstance != null)
                return tempInstance
            synchronized(this)
            {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "movie_database"
                ).build()
                INSTANCE = instance
                return instance
            }

        }

    }

}*/

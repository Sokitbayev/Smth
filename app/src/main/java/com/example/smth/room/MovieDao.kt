package com.example.smth.room

import androidx.room.*
import com.example.smth.fragments.Result


@Dao
interface MovieDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertMovie(movie: Result)

    @Update
    fun updateMovie(movie: Result)

    @Delete
    fun deleteMovie (movie: Result)

    @Query("Select * from movies_table")
    fun getMovies () :List<Result>
}
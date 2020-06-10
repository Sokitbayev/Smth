package com.example.smth.fragments

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

data class PopularMovies(
    val results: List<Result>
)
@Parcelize
@Entity(tableName = "movies_table")
data class Result(
    @PrimaryKey
    val id: Int,
    val overview: String,
    val poster_path: String,
    val release_date: String,
    val title: String,
    val vote_average: Double,
    val vote_count: Int
): Parcelable

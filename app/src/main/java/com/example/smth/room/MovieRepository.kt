package com.example.smth.room

import androidx.lifecycle.LiveData
import com.example.smth.fragments.Result


class MovieRepository(private val movieDao: MovieDao) {
    val allMovies: List<Result> = movieDao.getMovies()

    suspend fun insert(movie: Result)
    {
        movieDao.insertMovie(movie)
    }
}
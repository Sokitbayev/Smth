package com.example.smth.room
/*

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import com.example.smth.fragments.Result

class MovieViewModel(application: Application) : AndroidViewModel(application) {

    private val repository: MovieRepository
    val allMovie: List<Result>

    init {
        val movieDao = AppDatabase.getDatabase(application).movieDao()
        repository = MovieRepository(movieDao)
        allMovie = repository.allMovies
    }
    fun insert(movie: Result) = viewModelScope.launch(Dispatchers.IO) {
        repository.insert(movie)
    }
}*/

package com.example.android.guesstheword.screens.score

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ScoreViewModel(finalScore: Int) : ViewModel() {
    private val _score = MutableLiveData<Int>()
    val score: LiveData<Int>
        get() = _score

    init {
        _score.value = finalScore
    }

    class Factory(private val finalScore: Int) : ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(ScoreViewModel::class.java)) {
                return ScoreViewModel(finalScore) as T
            }
            throw IllegalArgumentException("Unknown ViewModel class")
        }
    }
}
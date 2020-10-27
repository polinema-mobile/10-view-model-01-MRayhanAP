package com.mrayhanap.simpleviewmodel.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mrayhanap.simpleviewmodel.model.Score

class CounterViewModel : ViewModel() {
    private var scoreMutableLiveData: MutableLiveData<Score> = MutableLiveData<Score>()
    private var score: Score = Score()
    val scoreLiveData: LiveData<Score>
        get() = scoreMutableLiveData

    fun addPointHome(point: Int) {
        score.homeScore += point
        scoreMutableLiveData.value = score
    }

    fun addPointAway(point: Int) {
        score.awayScore += point
        scoreMutableLiveData.value = score
    }

    fun resetScore() {
        score.homeScore = 0
        score.awayScore = 0
        scoreMutableLiveData.value = score
    }
}
package com.example.android.guesstheword.screens.game

import android.util.Log
import androidx.lifecycle.ViewModel

class GameViewModel:ViewModel(){
    init {
        Log.i("GameViewModel","View model cleared")
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("GameViewMode","view model cleared")
    }
}
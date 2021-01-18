package com.example.dagger2.Car

import android.util.Log
import javax.inject.Inject

class PetrolEngine @Inject constructor() : Engine {

    override fun start() {
        Log.d("Car", " Petrol Engine Started")
    }
}
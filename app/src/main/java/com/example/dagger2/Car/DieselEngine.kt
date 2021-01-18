package com.example.dagger2.Car

import android.util.Log
import javax.inject.Inject

class DieselEngine @Inject constructor() : Engine {

    override fun start() {
        Log.d("Car", " Diesel Engine Started")
    }
}
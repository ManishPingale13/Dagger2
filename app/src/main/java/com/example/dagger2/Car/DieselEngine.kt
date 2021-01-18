package com.example.dagger2.Car

import android.util.Log
import javax.inject.Inject

class DieselEngine @Inject constructor(val horsePower: Int) : Engine {

    override fun start() {
        Log.d("Car", " Diesel Engine Started Horse Power $horsePower")
    }
}
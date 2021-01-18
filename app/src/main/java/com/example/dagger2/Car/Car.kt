package com.example.dagger2.Car

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(private var engine: Engine, private var wheels: Wheels) {


    fun drive() {
        engine.start()
        Log.d(TAG, "Driving...")
    }


    companion object {
        private const val TAG = "MyCar"
    }
}
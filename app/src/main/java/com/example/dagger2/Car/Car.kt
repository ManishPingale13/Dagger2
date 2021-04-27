package com.example.dagger2.Car

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(
    private var engine: Engine,
    private var wheels: Wheels,
    private var driver: Driver
) {


    fun drive() {
        engine.start()
        Log.d(TAG, "$driver drives $this ")
    }


    companion object {
        private const val TAG = "MyCar"
    }
}
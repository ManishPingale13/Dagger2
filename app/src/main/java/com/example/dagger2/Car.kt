package com.example.dagger2

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(private var engine: Engine, private var wheels: Wheels) {

    fun drive(){
        Log.d(TAG, "Driving...")
    }

    companion object{
        private const val TAG = "MyCar"
    }
}
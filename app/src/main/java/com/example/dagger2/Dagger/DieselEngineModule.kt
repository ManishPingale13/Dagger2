package com.example.dagger2.Dagger

import com.example.dagger2.Car.DieselEngine
import com.example.dagger2.Car.Engine
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule constructor(val horsePower: Int) {

    @Provides
    fun provideDEngine(): Engine {
        return DieselEngine(horsePower)
    }
}
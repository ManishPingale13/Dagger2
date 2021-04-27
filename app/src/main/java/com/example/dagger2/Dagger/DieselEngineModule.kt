package com.example.dagger2.Dagger

import com.example.dagger2.Car.DieselEngine
import com.example.dagger2.Car.Engine
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule constructor(private val horsePower: Int) {

    @Provides
    fun provideDEngine(dieselEngine: DieselEngine): Engine {
        return dieselEngine
    }

    @Provides
    fun provideHP(): Int {
        return horsePower
    }
}
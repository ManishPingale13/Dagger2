package com.example.dagger2.Dagger

import com.example.dagger2.Car.DieselEngine
import com.example.dagger2.Car.Engine
import dagger.Binds
import dagger.Module

@Module
abstract class DieselEngineModule {

    @Binds
    abstract fun bindDEngine(dieselEngine: DieselEngine): Engine
}
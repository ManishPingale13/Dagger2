package com.example.dagger2.Dagger

import com.example.dagger2.Car.Car
import com.example.dagger2.MainActivity
import dagger.Component

@Component(modules = [WheelsModule::class, DieselEngineModule::class])
interface CarComponent {

    fun getCar(): Car

    fun inject(mainActivity: MainActivity)

}
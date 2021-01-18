package com.example.dagger2.Dagger

import com.example.dagger2.Car.Rims
import com.example.dagger2.Car.Tires
import com.example.dagger2.Car.Wheels
import dagger.Module
import dagger.Provides

@Module
class WheelsModule {

    @Provides
    fun provideRims(): Rims {
        return Rims()
    }

    @Provides
    fun provideTire(): Tires {
        val tires = Tires()
        tires.inflate()
        return tires
    }

    @Provides
    fun provideWheels(rims: Rims, tires: Tires): Wheels {
        return Wheels(rims, tires)
    }

}
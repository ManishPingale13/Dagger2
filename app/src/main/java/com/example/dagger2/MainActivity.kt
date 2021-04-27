package com.example.dagger2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dagger2.Car.Car
import com.example.dagger2.Dagger.DaggerCarComponent
import com.example.dagger2.Dagger.DieselEngineModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car1: Car

    @Inject
    lateinit var car2: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carComponent = DaggerCarComponent.builder()
            .dieselEngineModule(DieselEngineModule(69))
            .build()

        carComponent.inject(this)
        car1.drive()
        car2.drive()

    }
}
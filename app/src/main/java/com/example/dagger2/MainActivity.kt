package com.example.dagger2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dagger2.Car.Car
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carComponent = DaggerCarComponent.create()
        carComponent.inject(this)
        car.drive()

    }
}
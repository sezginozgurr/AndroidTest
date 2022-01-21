package com.example.androidtest.unittests

import com.example.androidtest.Car
import junit.framework.Assert.assertEquals
import org.junit.Test

class CarShould {

    private val car =  Car(5.0)

    @Test
    fun losingFuelWhenItTurnsOn(){
        car.turnOn()

        assertEquals(4.5,car.fuel)
    }
}
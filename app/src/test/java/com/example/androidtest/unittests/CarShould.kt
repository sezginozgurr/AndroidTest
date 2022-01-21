package com.example.androidtest.unittests

import junit.framework.Assert.assertEquals
import org.junit.Test

class CarShould {

    private val car =  Car(5.5) //Kırmızı hata alındı. Diğer branch'e

    @Test
    fun losingFuelWhenItTurnsOn(){
        car.turnOn()
        assertEquals(4.5,car.fuel)
    }
}
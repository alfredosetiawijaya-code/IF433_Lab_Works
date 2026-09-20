package week4

import week4.Vehicle

open class Car(
    brand: String,
    val numberOfDoors: Int
) : Vehicle(brand) {

    override fun honk() {
        println("$brand berbunyi: Beep Beep!")
    }

    override fun accelerate() {
        super.accelerate()
        println("$brand mempercepat laju kendaraan.")
    }
}
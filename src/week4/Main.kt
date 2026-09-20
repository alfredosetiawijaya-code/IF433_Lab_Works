package week04

import week4.Car
import week4.Vehicle

fun main() {
    val vehicle = Vehicle("Toyota")
    val car = Car("Honda", 4)

    vehicle.honk()
    vehicle.accelerate()

    println()

    car.honk()
    car.accelerate()
    car.openTrunk()
}
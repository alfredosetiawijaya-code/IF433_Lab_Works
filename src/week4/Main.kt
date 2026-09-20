package week04

import week4.Car
import week4.Developer
import week4.ElectricCar
import week4.Manager
import week4.Vehicle

fun main() {
    val vehicle = Vehicle("Toyota")
    val car = Car("Honda", 4)
    val electricCar = ElectricCar("Tesla", 4, 85)

    vehicle.honk()
    vehicle.accelerate()

    println()

    car.honk()
    car.accelerate()
    car.openTrunk()

    println()

    electricCar.accelerate()
    electricCar.honk()
    electricCar.openTrunk()

    println()

    val manager = Manager("Budi", 10000000)
    val developer = Developer("Andi", 8000000, "Kotlin")

    manager.work()
    println("Bonus Manager: Rp${manager.calculateBonus()}")

    println()

    developer.work()
    println("Bonus Developer: Rp${developer.calculateBonus()}")
}
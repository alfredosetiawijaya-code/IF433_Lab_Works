package week4

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
}
package week4

open class Vehicle(
    val brand: String
) {
    open fun honk() {
        println("$brand berbunyi: Tinnn!")
    }

    open fun accelerate() {
        println("$brand sedang berakselerasi.")
    }

    fun openTrunk() {
        println("$brand membuka bagasi.")
    }
}
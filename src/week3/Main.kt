package week03

import week3.Employee

fun main() {

    val e = Employee("Budi")

    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformance()

    println("Pajak yang harus dibayar: ${e.tax}")
}
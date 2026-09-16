import week3.Employee

fun main() {
    val e = Employee("Budi")
    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")
    e.incresesPerformance()

    println("Pajak yang harus dibayar: ${e.tax}")
}
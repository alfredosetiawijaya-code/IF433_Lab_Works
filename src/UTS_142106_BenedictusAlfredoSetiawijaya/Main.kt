package UTS_142106_BenedictusAlfredoSetiawijaya

import java.util.Scanner

fun main() {
    println("=== UMN CATERING MANAGER SYSTEM ===")
    println("[Database Setup] Adding Nasi Goreng Spesial...")

    val nasiGoreng = FoodMenu("Nasi Goreng Spesial", "nsg01", 0.0)
    nasiGoreng.basePrice = -15000
    nasiGoreng.basePrice = 25000
    println("[Database Setup] Price updated to Rp 25.000")

    val ayamBakar = FoodMenu("Ayam Bakar Madu", "aym02", 35000.0)
    val esTeh = DrinkMenu("Es Teh Lemon", "lem01", 8000.0, true)

    val menuCatalog = listOf<CateringMenu>(nasiGoreng, ayamBakar, esTeh)

    val scanner = Scanner(System.`in`)
    println("\n--- CUSTOMER DATA INPUT ---")
    print("Enter Customer Name: ")
    val custName = scanner.nextLine()

    print("Enter Phone Number: ")
    val custPhone = scanner.nextLine()

    print("Enter Delivery Address: ")
    val custAddress = scanner.nextLine()

    val customer = Customer(custName, custPhone, custAddress)
    val order = CateringOrder(customer)

    while (true) {
        println("\nMENU CATALOG")
        for ((index, menu) in menuCatalog.withIndex()) {
            println("${index + 1}.${menu.name}")
        }
        println("0. [FINISH & CHECKOUT]")

        print("Select Menu Number: ")
        val menuChoice = scanner.nextInt()

        if (menuChoice == 0) {
            println("Processing Checkout...")
            break
        }

        if (menuChoice in 1..menuCatalog.size) {
            print("Enter Quantity: ")
            val qty = scanner.nextInt()
            val selectedMenu = menuCatalog[menuChoice - 1]
            order.addMenuToOrder(selectedMenu, qty)
        } else {
            println("[Error] Invalid menu number, please try again.")
        }
    }

    order.status = OrderStatus.COOKING
    println()
    order.printInvoice()
}
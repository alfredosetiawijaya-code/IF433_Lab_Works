package UTS_142106_BenedictusAlfredoSetiawijaya

class CateringOrder(
    val customer: Customer,
    var status: OrderStatus = OrderStatus.WAITING_LIST
) {
    private val orderItems: MutableList<Pair<CateringMenu, Int>> = mutableListOf()

    fun addMenuToOrder(menu: CateringMenu, qty: Int) {
        orderItems.add(Pair(menu, qty))
        println("Order successfully added!")
    }

    fun printInvoice() {
        println("================ INVOICE ================")
        println("Customer: ${customer.name} (${customer.phone})")
        println("Delivery Address: ${customer.deliveryAddress}")
        println("Order Status: $status")

        var grandTotal = 0.0
        for ((index, item) in orderItems.withIndex()) {
            val menu = item.first
            val qty = item.second
            val subtotal = menu.calculateSubtotal(qty)
            grandTotal += subtotal

            print("${index + 1}.")
            menu.printMenuDetails(qty)
        }

        println("GRAND TOTAL: Rp ${String.format("%,.0f", grandTotal).replace(',', '.')}")
        println("=========================================")
    }
}
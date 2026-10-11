package UTS_142106_BenedictusAlfredoSetiawijaya

class FoodMenu(
    name: String,
    menuCode: String,
    basePrice: Double,
    val packagingFee: Double = 3000.0
) : CateringMenu(name, menuCode, basePrice) {

    override fun calculateSubtotal(quantity: Int): Double {
        return (basePrice + packagingFee) * quantity
    }

    override fun printMenuDetails(quantity: Int) {
        val subtotal = calculateSubtotal(quantity)
        println(" - $menuCode - $name")
        println("Qty: $quantity portions | Subtotal: Rp ${String.format("%,.0f", subtotal).replace(',', '.')}")
    }
}
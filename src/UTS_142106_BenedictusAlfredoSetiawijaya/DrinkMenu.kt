package UTS_142106_BenedictusAlfredoSetiawijaya

class DrinkMenu(
    name: String,
    menuCode: String,
    basePrice: Double,
    val isLargeSize: Boolean
) : CateringMenu(name, menuCode, basePrice) {

    override fun calculateSubtotal(quantity: Int): Double {
        val effectivePrice = if (isLargeSize) basePrice + 5000 else basePrice
        return effectivePrice * quantity
    }

    override fun printMenuDetails(quantity: Int) {
        val subtotal = calculateSubtotal(quantity)
        val sizeStr = if (isLargeSize) " (Large)" else " (Regular)"
        println(" - $menuCode - $name$sizeStr")
        println("Qty: $quantity cups | Subtotal: Rp ${String.format("%,.0f", subtotal).replace(',', '.')}")
    }
}
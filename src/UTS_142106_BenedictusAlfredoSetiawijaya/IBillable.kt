package UTS_142106_BenedictusAlfredoSetiawijaya

interface IBillable {
    fun calculateSubtotal(quantity: Int): Double
    fun printMenuDetails(quantity: Int)
}
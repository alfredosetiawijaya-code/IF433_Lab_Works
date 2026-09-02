package week01

fun main() {
    val gameTitle = "Minecraf"
    val price= 600000

    println("Game: $gameTitle")
    println("Harga: Rp $price")

    val discount = calculateDiscount(price)
    println("Diskon: Rp $discount")
}

fun calculateDiscount(price: Int) =
    if (price > 500000) {
        price * 0.20
    } else {
        price * 0.10
    }
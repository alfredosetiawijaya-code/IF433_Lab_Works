package week05

class CreditCard(
    accountName: String,
    val limit: Double
) : PaymentMethod(accountName) {

    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount

            println("Pembayaran berhasil menggunakan Credit Card.")
            println("Total penggunaan: $usedAmount")
            println("Sisa limit: ${limit - usedAmount}")
        } else {
            println("Transaksi ditolak. Limit tidak mencukupi.")
        }
    }
}
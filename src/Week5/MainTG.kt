package week05

fun main() {

    val eWallet = EWallet(
        accountName = "Budi",
        balance = 50000.0
    )

    val creditCard = CreditCard(
        accountName = "Andi",
        limit = 100000.0
    )

    val paymentMethods: List<PaymentMethod> = listOf(
        eWallet,
        creditCard
    )

    for (payment in paymentMethods) {
        println("Akun: ${payment.accountName}")
        payment.processPayment(75000.0)
        println()
    }
}
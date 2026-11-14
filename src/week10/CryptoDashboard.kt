package week10

fun main() {

    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 2.5))
    coinRepo.add(Coin("USDT", 1000.0))


    val response = ApiResponse(
        "200 OK",
        coinRepo.getAll()
    )


    println("=== CRYPTO WALLET DASHBOARD ===")
    println("Status: ${response.status}")

    response.data.forEach { coin ->
        println("Coin: ${coin.name}")
        println("Balance: ${coin.balance}")
        println("--------------------")
    }


    val txRepo = WalletRepository<Transaction>()

    txRepo.add(Transaction("TX001", 0.05))
    txRepo.add(Transaction("TX002", 1.25))
    txRepo.add(Transaction("TX003", 500.0))

    println("\n=== TRANSACTION HISTORY ===")

    txRepo.getAll().forEach { transaction ->
        println("Transaction ID: ${transaction.id}")
        println("Amount: ${transaction.amount}")
        println("--------------------")
    }



}

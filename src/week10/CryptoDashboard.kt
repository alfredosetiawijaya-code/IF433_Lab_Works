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


}

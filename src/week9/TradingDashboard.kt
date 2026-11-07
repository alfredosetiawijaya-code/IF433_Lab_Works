package week09

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 15, -8.5, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 20, 12.3, "CLOSED"),
        TradeLog("BTCUSDT", "LONG", 10, 4.8, "OPEN"),
        TradeLog("ETHUSDT", "LONG", 5, -2.5, "OPEN")
    )
    val closedTrades = tradeHistory.filter {
        it.status == "CLOSED"
    }
    val winningTrades = closedTrades.filter {
        it.roe > 0
    }
    val losingTrades = closedTrades.filter {
        it.roe <= 0
    }
    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map {
            "WIN [${it.pair} - ${it.position}]: ${"%+.1f".format(it.roe)}% ROE (Lev: ${it.leverage}x)"
        }
}
package week03

fun main() {

    val player = Player("Budi")

    player.addXp(50)
    println("Level sekarang: ${player.level}")

    player.addXp(60)
    println("Level sekarang: ${player.level}")

    // player.xp = 500
}
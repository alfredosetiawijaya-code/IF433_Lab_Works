package week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            println("Monster muncul: ${event.monsterName}")
        }

        is BattleState.LootDropped -> {
            println("Item ditemukan: ${event.item.name}")
            println("Damage: ${event.item.damage}")
            println("Rarity: ${event.item.rarity}")
        }

        is BattleState.GameOver -> {
            println("Game Over: ${event.reason}")
        }

        BattleState.SafeZone -> {
            println("Pemain berada di zona aman.")
        }
    }
}

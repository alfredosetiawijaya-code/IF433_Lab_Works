package week07

fun main() {
    println("=== LATIHAN 1 ===")

    DatabaseManager.connect()

    val client = NetworkClient.create(
        "https://api.umn.ac.id"
    )
    client.connect()

    println("\n=== LATIHAN 2 ===")

    val regular1 = RegularUser("Budi", 20)
    val regular2 = RegularUser("Budi", 20)

    println(regular1)
    println("Regular class sama: ${regular1 == regular2}")

    val user1 = User("Budi", 20)
    val user2 = User("Budi", 20)

    println(user1)
    println("Data class sama: ${user1 == user2}")

    val updatedUser = user1.copy(age = 21)
    println("User asli: $user1")
    println("User baru: $updatedUser")

    val (name, age) = updatedUser
    println("Nama: $name, Umur: $age")

    println("\n=== LATIHAN 3 ===")

    val appState = AppState.RUNNING
    println("Status aplikasi: $appState")

    val response: ApiResponse = ApiResponse.Loading

    val uiMessage = when (response) {
        is ApiResponse.Success -> "Data: ${response.data}"
        is ApiResponse.Error -> "Error: ${response.message}"
        ApiResponse.Loading -> "Tampilkan Spinner"
    }

    println(uiMessage)

    println("\n=== RPG GAME ENGINE ===")

    GameManager.startGame()
    GameManager.startGame()

    println(
        "Legendary drop chance: " +
                "${ItemRarity.LEGENDARY.dropChance}%"
    )

    val starterSword = Weapon.forgeStarterSword()

    println("\n=== SENJATA AWAL ===")
    println("Nama: ${starterSword.item.name}")
    println("Damage: ${starterSword.item.damage}")
    println("Rarity: ${starterSword.item.rarity}")
    println("Durability: ${starterSword.durability}")

    val upgradedItem = starterSword.item.copy(
        damage = 25
    )

    println("\n=== UPGRADE SENJATA ===")
    println("Senjata asli: ${starterSword.item}")
    println("Senjata upgrade: $upgradedItem")

    println("\n=== BATTLE EVENTS ===")

    processEvent(BattleState.SafeZone)

    processEvent(
        BattleState.MonsterEncounter("Goblin Nakal")
    )

    processEvent(
        BattleState.LootDropped(upgradedItem)
    )

    processEvent(
        BattleState.GameOver("Terkena jebakan racun")
    )

    val epicSword = Weapon.forgeEpicSword()

    println("\n=== SENJATA EPIC ===")
    println("Nama: ${epicSword.item.name}")
    println("Damage: ${epicSword.item.damage}")
    println("Rarity: ${epicSword.item.rarity}")
    println("Durability: ${epicSword.durability}")

    println("Legendary Drop Chance: ${ItemRarity.LEGENDARY.dropChance}")

    val starterSword = Weapon.forgeStarterSword()
    val epicSword = Weapon.forgeEpicSword()

    println(starterSword)
    println(epicSword)
    val strongerSword = starterSword.item.copy(damage = 25)

    println("Original Item: ${starterSword.item}")
    println("Copied Item: $strongerSword")

    val events = listOf(
        BattleState.SafeZone,
        BattleState.MonsterEncounter,
        BattleState.LootDropped,
        BattleState.GameOver
    )

    for (event in events) {
        when (event) {
            BattleState.SafeZone -> println("Player is in a safe zone.")
            BattleState.MonsterEncounter -> println("A monster appears!")
            BattleState.LootDropped -> println("Loot has been dropped!")
            BattleState.GameOver -> println("Game Over!")
        }
    }
}




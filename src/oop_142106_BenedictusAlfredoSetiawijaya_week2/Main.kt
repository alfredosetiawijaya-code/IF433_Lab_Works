package oop_142106_BenedictusAlfredoSetiawijaya_week2

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Masukkan nama Hero: ")
    val name = scanner.nextLine()

    print("Masukkan Base Damage: ")
    val damage = scanner.nextInt()

    val hero = Hero(name, damage)

    var enemyHp = 100

    println()
    println("--- MINI RPG BATTLE ---")
    println("${hero.name} memasuki arena!")

    while (hero.isAlive() && enemyHp > 0) {

        println()
        println("HP Hero  : ${hero.hp}")
        println("HP Enemy : $enemyHp")
        println("1. Serang")
        println("2. Kabur")
        print("Pilih: ")

        val pilihan = scanner.nextInt()

        if (pilihan == 1) {

            hero.attack("Enemy")

            enemyHp -= hero.baseDamage

            if (enemyHp < 0) {
                enemyHp = 0
            }

            println("HP Enemy sekarang: $enemyHp")

            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()

                println("Enemy membalas!")
                hero.takeDamage(enemyDamage)

                println("Enemy memberikan damage: $enemyDamage")
                println("HP Hero sekarang: ${hero.hp}")
            }

        } else if (pilihan == 2) {

            println("${hero.name} memilih untuk kabur!")
            break

        } else {

            println("Pilihan tidak valid.")
        }
    }

    println()
    println("--- HASIL PERTARUNGAN ---")

    if (enemyHp <= 0) {
        println("${hero.name} menang!")
    } else if (!hero.isAlive()) {
        println("Enemy menang!")
    } else {
        println("${hero.name} kabur dari pertarungan.")
    }
}
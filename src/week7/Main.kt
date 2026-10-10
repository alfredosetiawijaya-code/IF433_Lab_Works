package week7

import week07.DatabaseManager
import week07.NetworkClient
import week07.RegularUser

package oop_NIM_NAMA.week07

fun main() {
    DatabaseManager.connect()

    val client = NetworkClient.create(
        "https://api.umn.ac.id"
    )
    client.connect()
    val user1 = RegularUser("Budi", 20)
    val user2 = RegularUser("Budi", 20)

    println(user1)
    println(user1 == user2)
}

package week7

import week07.DatabaseManager
import week07.NetworkClient

package oop_NIM_NAMA.week07

fun main() {
    DatabaseManager.connect()

    val client = NetworkClient.create(
        "https://api.umn.ac.id"
    )
    client.connect()
}

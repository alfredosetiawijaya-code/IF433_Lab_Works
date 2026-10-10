package week7

import week07.ApiResponse
import week07.DatabaseManager
import week07.NetworkClient
import week07.RegularUser
import week07.User

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

    val user3 = User("Budi", 20)
    val user4 = User("Budi", 20)

    println(user3)
    println(user3 == user4)

    val user5 = user3.copy(age = 21)

    println("User asli: $user3")
    println("User hasil copy: $user5")

    val (name, age) = user5
    println("Nama: $name")
    println("Umur: $age")

    val response: ApiResponse = ApiResponse.Loading

    val uiMessage = when (response) {
        is ApiResponse.Success -> "Data: ${response.data}"
        is ApiResponse.Error -> "Error: ${response.message}"
    }
}

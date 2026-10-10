package week07

class NetworkClient private constructor(
    val url: String
) {
    fun connect() {
        println("Menghubungkan ke $url")
    }
}

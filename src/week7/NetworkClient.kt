package week07

class NetworkClient private constructor(
    val url: String
) {
    fun connect() {
        println("Menghubungkan ke $url")
    }

    companion object {
        fun create(url: String): NetworkClient {
            return NetworkClient(url)
        }
    }
}
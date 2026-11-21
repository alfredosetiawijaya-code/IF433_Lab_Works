package week11

data class User(val name: String== "", val age: Int=0)
fun main() {
    println("=== TEST LET FUNCTION ===")

    val name: String? = "Alexander"

    val length = name?.let {
        println("Nama terdeteksi: $it")
        it.length
    }

    println("Panjang nama: $length")

    println("\n=== TEST RUN FUNCTION ===")

    val result = "Kotlin".run {
        println("Memproses kata: $this")
        length * 2
    }

    println("Hasil kalkulasi run: $result")
}

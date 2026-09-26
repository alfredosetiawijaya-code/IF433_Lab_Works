package week05

fun main() {

    val mathHelper = MathHelper()

    val luasPersegi = mathHelper.hitungLuas(5)
    val luasPersegiPanjang = mathHelper.hitungLuas(10, 5)
    val luasLingkaran = mathHelper.hitungLuas(7.0)

    println("Luas Persegi = $luasPersegi")
    println("Luas Persegi Panjang = $luasPersegiPanjang")
    println("Luas Lingkaran = $luasLingkaran")
}
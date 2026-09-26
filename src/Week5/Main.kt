package week05

fun main() {

    val pegawaiList: List<Pegawai> = listOf(
        Dosen("Budi"),
        Admin("Andi")
    )

    for (pegawai in pegawaiList) {

        pegawai.bekerja()

        when (pegawai) {
            is Dosen -> {
                pegawai.mengajar()
            }

            is Admin -> {
                println("${pegawai.nama} adalah seorang admin.")
            }
        }

        println()
    }
}
package week05

class Dosen(nama: String) : Pegawai(nama) {

    override fun bekerja() {
        println("$nama sedang mengajar mahasiswa.")
    }

    fun mengajar() {
        println("$nama sedang melakukan kegiatan mengajar.")
    }
}
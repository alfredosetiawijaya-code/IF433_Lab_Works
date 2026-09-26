package oop_<nim>_<nama>.week05

class Admin(nama: String) : Pegawai(nama) {

    override fun bekerja() {
        println("$nama sedang mengelola administrasi.")
    }
}
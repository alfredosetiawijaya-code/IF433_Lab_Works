package oop_142106_BenedictusAlfredoSetiawijaya_week2

class Student(
    val name: String,
    val nim: String,
    val major: String
    val gpa: Double = 0.0
){
    init{
        if (nim.length != 5) {
            println("WARNING: objek tercipta dengan NIM($nim)yang tidak valid!")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem")
        } else {
            println("LOG : objek student $name berhasil di alokasikan di memory")
        }
    }
    constructor(
        name: String,
        nim: String
    ) : this(name, nim, "Non-Matriculated")
}
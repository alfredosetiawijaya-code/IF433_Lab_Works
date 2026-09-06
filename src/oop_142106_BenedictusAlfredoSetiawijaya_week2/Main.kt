package oop_142106_BenedictusAlfredoSetiawijaya_week2

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- APLIKASI PMB UMN ---")

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next()

    scanner.nextLine()

    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
    } else {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()

        val s1 = Student(name, nim, major)

        println("Status: Pendaftaran Selesai.")
    }
    print("Pilih jalur (1. Reguler, 2. Umum):")
    val type = scanner.nextInt()
    scanner.nextLine()

    if (type == 1) {
        println("Masukan Jurusan: ")
        val major = scanner.nextLine()
        val s1 = Student(name, nim, major)
        println("Terdaftar di: ${s1.major}dengan gpa awal ${s1.gpa}")
    } else if (type == 2) {
        val s2 = Student(name, nim)
        println("Terdaftar di: ${s2.major}dengan gpa awal ${s2.gpa}")
    } else {
        println("Pilihan ngawur,pendaftaran batal!")
    }
}
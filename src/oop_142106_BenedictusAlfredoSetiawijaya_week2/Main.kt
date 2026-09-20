package oop_142106_BenedictusAlfredoSetiawijaya_week2

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Masukkan Judul Buku: ")
    val bookTitle = scanner.nextLine()

    print("Masukkan Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Masukkan Lama Pinjam: ")
    var duration = scanner.nextInt()

    if (duration < 0) {
        duration = 1
    }

    val loan = Loan(bookTitle, borrower, duration)

    println()
    println("--- DETAIL PEMINJAMAN ---")
    println("Judul Buku: ${loan.bookTitle}")
    println("Peminjam: ${loan.borrower}")
    println("Lama Pinjam: ${loan.loanDuration} hari")
    println("Total Denda: Rp${loan.calculateFine()}")
}
package oop_02_Arda.Week2.week2

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Masukkan Judul Buku: ")
    val title = scanner.nextLine()

    print("Masukkan Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Masukkan Lama Pinjam (hari): ")
    var duration = scanner.nextLine().toIntOrNull() ?: 1

    if (duration < 0) {
        duration = 1
    }

    val loan = Loan(title, borrower, duration)

    println("\n=== DETAIL PEMINJAMAN ===")
    println("Judul Buku   : ${loan.bookTitle}")
    println("Peminjam     : ${loan.borrower}")
    println("Durasi Pinjam: ${loan.loanDuration} hari")
    println("Total Denda  : Rp ${loan.calculateFine()}")
}

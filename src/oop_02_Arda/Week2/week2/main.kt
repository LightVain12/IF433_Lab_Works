package oop_02_Arda.Week2.week2

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- APLIKASI PMB UMN ---")

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next()

    // Membersihkan buffer newline agar input berikutnya tidak error
    scanner.nextLine()

    // --- VALIDASI NIM ---
    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
    } else {
        // --- LANGKAH 6: MENU PILIHAN ---
        print("Pilih Jalur (1. Reguler, 2. Umum): ")
        val type = scanner.nextInt()

        // PENTING: Consume newline lagi setelah nextInt()
        scanner.nextLine()

        if (type == 1) {
            // JALUR 1: REGULER (User input Jurusan)
            // Menggunakan Primary Constructor
            print("Masukkan Jurusan: ")
            val major = scanner.nextLine()

            val s1 = Student(name, nim, major)
            println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")

        } else if (type == 2) {
            // JALUR 2: UMUM (Jurusan otomatis "Non-Matriculated")
            // Menggunakan Secondary Constructor
            val s2 = Student(name, nim)
            println("Terdaftar di: ${s2.major} dengan GPA awal ${s2.gpa}")

        } else {
            // JALUR SALAH
            println("Pilihan ngawur, pendaftaran batal!")
        }
    }
}
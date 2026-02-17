package oop_02_Arda.Week2.week2

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("=== SISTEM PENDAFTARAN MAHASISWA ===")
    println("1. Daftar dengan jurusan")
    println("2. Daftar tanpa jurusan")
    print("Pilih (1/2): ")

    val choice = scanner.nextLine()

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (11 digit): ")
    val nim = scanner.nextLine()

    if (nim.length != 11) {
        println("Input ditolak. NIM harus 11 digit.")
        return
    }

    val student: Student

    if (choice == "1") {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()

        print("Masukkan GPA (0.0 - 4.0): ")
        val gpa = scanner.nextLine().toDoubleOrNull() ?: 0.0

        student = Student(name, nim, major, gpa)
    } else {
        student = Student(name, nim)
    }

    println("\n=== DATA MAHASISWA ===")
    println("Nama   : ${student.name}")
    println("NIM    : ${student.nim}")
    println("Jurusan: ${student.major}")
    println("GPA    : ${student.gpa}")
}

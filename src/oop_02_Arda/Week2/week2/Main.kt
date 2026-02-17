package oop_02_Arda.Week2.week2

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (11 digit): ")
    val nim = scanner.nextLine()

    print("Masukkan Jurusan: ")
    val major = scanner.nextLine()

    if (nim.length != 11) {
        println("Input ditolak. NIM harus 11 digit.")
        return
    }

    val student = Student(name, nim, major)

    println("\n=== DATA MAHASISWA ===")
    println("Nama   : ${student.name}")
    println("NIM    : ${student.nim}")
    println("Jurusan: ${student.major}")
}
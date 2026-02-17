package oop_02_Arda.Week2


class Student(
    val name: String,
    val nim: String,
    var major: String,
    var gpa: Double = 0.0
) {
    constructor(name: String, nim: String) : this(name, nim, "Non-Matriculated")

    init {
        if (nim.length != 11) {
            println("WARNING: NIM harus 11 digit! Data yang dimasukkan tidak valid.")
        }
        if (name.isBlank()) {
            println("WARNING: Nama tidak boleh kosong!")
        }
        if (major.isBlank()) {
            println("WARNING: Jurusan tidak boleh kosong!")
        }
        if (gpa < 0.0 || gpa > 4.0) {
            println("WARNING: GPA harus antara 0.0 sampai 4.0!")
        }
    }
}
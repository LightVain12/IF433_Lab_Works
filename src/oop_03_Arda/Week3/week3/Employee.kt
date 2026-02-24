package oop_03_Arda.Week3.week3

class Employee(val name: String) {
    var salary: Int = 0
        set(value) {
            println("Mencoba set gaji ke: $value")
            // PERINGATAN: Memanggil setter di dalam setter (Recursive)
            this.salary = value
        }
}
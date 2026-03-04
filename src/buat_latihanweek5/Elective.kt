package buat_latihanweek5

class Elective: MataKuliah() {
    override fun set_matkul(sks: Int) {
        super.nama = "OOP"
        println("Elective $(super.nama) sks $sks")
    }
    fun ada_praktek(){
        println("wajib di praktekin")
    }
}
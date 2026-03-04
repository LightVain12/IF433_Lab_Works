package buat_latihanweek5

abstract class MataKuliah {
    var nama:String = "";
    abstract fun set_matkul(sks:Int);

    fun hasil_Matkul() {
        println("Matkul diminati")
    }
}
package Week7

enum class MataKuliah (val JmlSks : Int ) {
    OOP(JmlSks=3),
    GAMEDEV(JmlSks=4),
    DASPRO(JmlSks=2),;

    fun sks_Matkul() {
        println("jml sksnya : $JmlSks ")
    }
}
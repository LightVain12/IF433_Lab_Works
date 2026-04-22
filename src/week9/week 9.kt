package week9

fun main() {
    println("========== LIST OF ==========");
    val arSiswa = listOf("Budi", "Danu", "Susi", "Cica");
    //view
    println(arSiswa);   //object -> array

    //panjang array
    println("banyak siswa: " + arSiswa.size);

    //munculin satu orang aja
    println("siswa bernama ${arSiswa[1]}");

    //munculin semua orang ---> for-each
    for(a in arSiswa) {
        print("Siswa "+ a + " dan ");
    }


    println("\n========== LIST OF MUTABLE ==========")
    val arMatkul = mutableListOf("OOP","Pemweb","Natdis","Kalkulus");
    arMatkul.add("Algo");
    arMatkul[2] = "Aljabar Linear"
    arMatkul.remove("Pemweb");
    println(arMatkul);
}

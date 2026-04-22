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

    println("========== LIST OF Imut ==========");
    val arnilai = setOf(80,90,75,85,80,38,50,85);
    println("banyak nilai ; ${arnilai.size}");
    println("ada angka 90 gak? ${arnilai.contains(90)}");
    println(arnilai.size);
    println(arnilai);

    println("========== LIST OF Imut ==========");
    val arMahasiswa = mutableListOf("Andi","Yanto", "Udin", "Muda");
    arMahasiswa.add("Yanti");
    arMahasiswa.remove("Udin");
    arMahasiswa.add("Udin");
    println(arMahasiswa);

    println("========== LIST OF Imut ==========");
    val arResto = mapOf(
        "Ayam" to 5000,
        "Bakpao" to 5000,
        "Sayuran" to 2500
    );
    println("banyak Menu ${arResto.size}");
    println("harga Ayam ${arResto["Ayam"]}");
    println("List makanan : ${arResto.keys}")
    println("List harga : ${arResto.values}");
    println(arResto);

    println("========== LIST OF Imut ==========");
    val arKHS= mutableMapOf(
        "Toni" to 80,
        "Nika" to 85,
        "Ara" to 87,
        "Davin" to 90
    );
    arKHS.remove("Toni");
    arKHS["Nika"] = 90;
    arKHS["Ara"] = 92
    println(arKHS);

    println("========== Lamda ==========");
    fun tambah (a: Int, b: Int, c: Int): Int {
        return a + b + c;
    }
    println("Hasil Tambaha : ${tambah(5,2,1)}");

    val  kurang = {a: Int, b: Int, c: Int -> a - b - c;}
    println("Hasil pengurang ${kurang(5,2,1)}");

    println("========== Lamda ==========");
    val  pangkat = {a: Int -> a*a}
    val hasilPangkat: (Int) -> Int = {it * it}
    println("Hasil pangkat : ${hasilPangkat(5)}");


        println("========== Foreach Biasa ==========");
    for (a in arMatkul){
        println(a)

    }

    println("========== Foreach IT ==========");
    arMatkul.forEach {
        println(it) }

    println("========== Foreach Variable ==========");
    arMatkul.forEach {
        mk -> println(mk)
    }

    }

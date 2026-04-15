package Week7

fun main() {
    println("server: ${Koneksi.linkServer}");
    Koneksi.test_koneksi()

    Mahasiswa.nama="udin";
    val na:Int = Mahasiswa.set_nilai(uts = 80, uas = 100);
    println("Nilai ${Mahasiswa.nama} adalah $na");

    Mahasiswa.isi_nama_kampus(namaUniv = "UMN")

    val dsn1 = Dosen( nama = "Indah", nik = "12345", tahunMasuk =  "2020")
    println(dsn1);
    val dsn2 = Dosen( nama = "Budi", nik = "32154", tahunMasuk =  "2020")
    println(dsn2);
    println("Nama dosen1 : ${dsn1.nama} masukTahun ${dsn1.tahunMasuk}");

    println("Matkul favorit saya : " + MataKuliah.OOP.name )
    println("Index Matkul  : " + MataKuliah.OOP.ordinal )
    MataKuliah.OOP.sks_Matkul();

    //looping munculin semua = pengguna for each
    for (matkul in MataKuliah.entries){
        println("matkul : " + matkul + "" );
        matkul.sks_Matkul();
    }

}
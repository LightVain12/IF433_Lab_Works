package oop_04_Arda.Week4.week4

import oop_04_Arda.Week4.week4.Makanan

class Sushi: Makanan() {
    private var jenis:String = "";
    public fun sushi_terjual(jns:String, jml:Int) {
        this.jenis = jns;
        harga = jml * 100;
        println("Sushi $jenis laku $harga");
    }
}

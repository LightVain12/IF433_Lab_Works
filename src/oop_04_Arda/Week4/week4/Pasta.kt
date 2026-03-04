package oop_04_Arda.Week4.week4

class Pasta:Makanan() {
    private var toping:String="";
    public fun pasta_terjual(jml:Int) {
        this.toping="mora";
        super.harga = jml * 120;
        println("Pasta $toping laris $harga");
    }
    override public fun jual_makanan() {
        println("Saya jual PASTA enak");
    }
}
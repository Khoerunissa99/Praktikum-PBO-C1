class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}


public class Asersi2 {
    public static void main(String[] args){
        double jariJari = 0;
        assert(jariJari > 0): "jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling lingkaran = "
            + kelilingLingkaran);
    }
}
// kesalahan
// asersi digunakan untuk debugging, tidak untuk validasi input pengguna
// asersi tidak selalu aktif saat runtime dan berjalan dengan flag -ea 
// dan tidak ada mekanisme penanganan kesalahan yang jelas

// solusi
// maka gunakan if untuk validasi input pengguna
// dan gunakan try-catch untuk penanganan kesalahan




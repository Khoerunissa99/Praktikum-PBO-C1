// Nama : Khoerunissa Billah Wahyu Sarbini
// Nim : 24060123140178
// File : MainBangunDatar.java

public class MainBangunDatar {
    public static void main(String[] args) {
        Persegi<Double> persegi = new Persegi<>(4.2);
        PersegiPanjang<Double> persegiPanjang = new PersegiPanjang<>(2.0, 5.0);
        Segitiga<Double> segitiga = new Segitiga<>(3.0, 5.0, 6.0);
     
        System.out.println("---BANGUN DATAR---");
        System.out.println("\n" + persegi);
        System.out.println("\n" + persegiPanjang);
        System.out.println("\n" + segitiga);
    }
}

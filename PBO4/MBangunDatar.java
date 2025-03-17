// Nama : Khoerunissa Billah Wahyu Sarbini
// Nim: 24060123140178
// File : MBangunDatar.java
// Lab C1

public class MBangunDatar {
    public static void main(String[] args) {
        Persegi persegi = new Persegi(6, "Hijau", "Kuning");
        persegi.printInfo();
        System.out.println("Luas :" + persegi.getLuas());

        
        Lingkaran lingkaran = new Lingkaran(7, "Merah", " Ungu");
        lingkaran.printInfo();
        System.out.println("Luas :" +lingkaran.getLuas());
    }
    
}

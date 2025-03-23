// Nama : Khoerunissa Billah Wahyu Sarbini
// Nim : 24060123140178
// File : MBangunDatar.java

public class MBangunDatar {
    public static void main(String[] args) {
        // Persegi persegi = new Persegi(6, "Hijau", "Kuning");
        // persegi.printInfo();
        // System.out.println("Luas :" + persegi.getLuas());

        
        // Lingkaran lingkaran = new Lingkaran(7, "Merah", " Ungu");
        // lingkaran.printInfo();
        // System.out.println("Luas :" +lingkaran.getLuas());

        // // Dengan reference type BangunDatar
        // BangunDatar P1 = new Persegi(10, "Merah", "Biru");
        // System.out.println("Luas B1 = " +P1.getLuas());

        BangunDatar L1 = new Lingkaran(7, "Hijau", "Ungu");
        System.out.println("Luas L1 = " + L1.getLuas());

        //Dengan tipe data class sendiri
        Persegi P2 = new Persegi(5, "Hijau", "Kuning");
        System.out.println("Luas P2 = " + P2.getLuas());
        Lingkaran L2 = new Lingkaran(14, "Hijau", "Merah");
        System.out.println("Luas L2 = " + L2.getLuas());

        System.out.println("Luas P1 == L1 ?" + P1.isEqualLuas(L1));
        System.out.println("Keliling P1 == L1?" + P1.isEqualKeliling(L1));

        //bisa
        //bisa, tapi harus implementasikan default getluas dan getkeliling trs langsung manggil isequal tp kurang tepat aja
        //fleksibel

        // ZoomIn dan ZoomOut
        System.out.println("Sisi P1 sebelum zoomIn : " + ((Persegi)P1).getSisi());
        ((Persegi)P1).zoomIn();
        System.out.println("Sisi P1 setelah zoomIn : " + ((Persegi)P1).getSisi());

        System.out.println("Sisi P1 sebelum zoomOut : " + ((Persegi)P1).getSisi());
        ((Persegi)P1).zoomOut();
        System.out.println("Sisi P1 setelah zoomOut : " + ((Persegi)P1).getSisi());
    }
    
}

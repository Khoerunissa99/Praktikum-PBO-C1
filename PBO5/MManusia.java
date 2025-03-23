// Nama : Khoerunissa Billah Wahyu Sarbini
// Nim : 24060123140178
// File : MManusia.java

import java.time.LocalDate;

public class MManusia {
    public static void main(String[] args) {
        
        PNS p1 = new PNS("Satriyo", LocalDate.of(2006, 4, 1), "Jl. Seroja", 15_000_000, "198302032006041002");
        Pengusaha pe1 = new Pengusaha("Adhy", LocalDate.of(2000, 1, 1), "Jl. Air", 55_000_000, "000-556-773-212-000-5");
        Petani pt1 = new Petani("Nugraha", LocalDate.of(1977, 1, 9), "Jl. Bunga 9 Tembalang", 5_000_000, "Wonogiri");

        PNS p2 = new PNS("Panji", LocalDate.of(2010, 4, 1), "Jl. Default", 10_000_000, "198004212010041002");
        p2.setAlamat("Jl. Panorama 111 Tembalang");

        System.out.println("Jumlah Manusia    = " + Manusia.getCounterMns());

        System.out.println("\n------PNS 1----\n");
        p1.cetakInfo();
        System.out.println("Jumlah PNS        = " + PNS.getCounterPNS());
        System.out.println("Pajak PNS p1          = Rp " + p1.hitungPajak());
        System.out.println("Masa Kerja PNS p1        = " + p1.hitungMasaKerja() + " tahun");

        System.out.println("\n------PNS 2----\n");
        p2.cetakInfo();
        System.out.println("Pajak PNS p2          = Rp " + p2.hitungPajak());
        System.out.println("Masa Kerja PNS p2      = " + p2.hitungMasaKerja() + " tahun");
        

        System.out.println("\n------PENGUSAHA----\n");
        pe1.cetakInfo();
        System.out.println("Jumlah Pengusaha  = " + Pengusaha.getCounterPengusaha());
        System.out.println("Pajak Pengusaha pe1   = Rp " + pe1.hitungPajak());
        System.out.println("Masa Kerja Pengusaha pe1 = " + pe1.hitungMasaKerja() + " tahun");
        

        System.out.println("\n------PETANI----\n");
        pt1.cetakInfo();
        System.out.println("Jumlah Petani     = " + Petani.getCounterPetani());
        System.out.println("Pajak Petani pt1      = Rp " + pt1.hitungPajak());
        System.out.println("Masa Kerja Petani pt1    = " + pt1.hitungMasaKerja() + " tahun");
        
    }
}

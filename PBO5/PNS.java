// Nama : Khoerunissa Billah Wahyu Sarbini
// Nim : 24060123140178
// File : PNS.java

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class PNS extends Manusia implements Pajak {
    private String nip;
    private static final int A = 8;
    private static int counterPNS = 0; 

    public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++; 
    }

    public static int getCounterPNS() {
        return counterPNS;
    }
    
    public String getNip() { 
        return nip; 
    }
    public void setNip(String nip) {
        this.nip = nip; 
    }
    
    @Override
    public int hitungMasaKerja() {
        return (int) ChronoUnit.YEARS.between(tgl_mulai_kerja, LocalDate.now()) + A;
    }
    
    @Override
    public double hitungPajak() {
        return 0.1 * pendapatan;
    }
    
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP: " + nip);
    }
}

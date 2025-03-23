// Nama : Khoerunissa Billah Wahyu Sarbini
// Nim : 24060123140178
// File : Pengusaha.java

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Pengusaha extends Manusia implements Pajak {
    private String npwp;
    private static int counterPengusaha;
    private static final int B = 7;
    
    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }
    public static int getCounterPengusaha() {
        return counterPengusaha;
    }
    
    public String getNpwp() { 
        return npwp; 
    }
    public void setNpwp(String npwp) { 
        this.npwp = npwp; 
    }
    
    @Override
    public int hitungMasaKerja() {
        return (int) ChronoUnit.YEARS.between(tgl_mulai_kerja, LocalDate.now()) + B;
    }
    
    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }
    
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP: " + npwp);
    }
}

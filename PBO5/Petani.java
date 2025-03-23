// Nama : Khoerunissa Billah Wahyu Sarbini
// Nim : 24060123140178
// File : Petani.java

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Petani extends Manusia {
    private String asal_kota;
    private static int counterPetani = 0;
    private static final int C = 1;
    
    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }
    
    public static int getCounterPetani() {
        return counterPetani;
    }
    
    public String getAsalKota() { 
        return asal_kota; 
    }
    public void setAsalKota(String asal_kota) { 
        this.asal_kota = asal_kota; 
    }
    
    @Override
    public int hitungMasaKerja() {
        return (int) ChronoUnit.YEARS.between(tgl_mulai_kerja, LocalDate.now()) + C;
    }
    @Override
    public double hitungPajak() {
        return 0; 
    }
    
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota: " + asal_kota);
    }
}

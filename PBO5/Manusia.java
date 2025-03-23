// Nama : Khoerunissa Billah Wahyu Sarbini
// Nim : 24060123140178
// File : Manusia.java

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


abstract class Manusia {
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;
    
    public Manusia(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    public Manusia() {
        counterMns++;
    }

    public static int getCounterMns() {
        return counterMns;
    }

    public abstract double hitungPajak();
    
    public String getNama() { 
        return nama; 
    }

    public void setNama(String nama) { 
        this.nama = nama; 
    }
    
    public LocalDate getTglMulaiKerja() {
        return tgl_mulai_kerja; 
    }
    public void setTglMulaiKerja(LocalDate tgl_mulai_kerja) {
        this.tgl_mulai_kerja = tgl_mulai_kerja; 
    }
    
    public String getAlamat() { 
        return alamat; 
    }
    public void setAlamat(String alamat) { 
        this.alamat = alamat; 
    }
    
    public double getPendapatan() { 
        return pendapatan; 
    }
    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan; 
    }
    
    public int hitungMasaKerja() {
        return (int) ChronoUnit.YEARS.between(this.tgl_mulai_kerja, LocalDate.now());
    }
    
    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Mulai Kerja: " + tgl_mulai_kerja);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
    }
}


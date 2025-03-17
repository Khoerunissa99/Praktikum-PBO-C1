// Nama : Khoerunissa Billah Wahyu Sarbini
// Nim: 24060123140178
// File : DosenTamu.java
// Lab C1

import java.time.LocalDate;

public class DosenTamu extends Dosen {
    private String NIDK;
    private LocalDate akhirKontrak;

    public DosenTamu(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, int gajiPokok, String fakultas, String NIDK, LocalDate akhirKontrak) {
    super(NIP, nama, tanggalLahir, TMT, gajiPokok, fakultas);
    this.NIDK = NIDK;
    this.akhirKontrak = akhirKontrak;
}
    public String getNIDK(){
        return NIDK;
    }

    public void setNIDK(String NIDK){
        this.NIDK = NIDK;
    }

    public LocalDate getAkhirKontrak(){
        return akhirKontrak;
    }

    public void setAkhirKontrak(LocalDate akhirKontrak){
        this.akhirKontrak = akhirKontrak;
    }

    public int hitungTunjangan(){
        return super.hitungTunjangan(0.025);
    }


    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDK: " + NIDK);
        System.out.println("Jabatan: Dosen Tamu");
        System.out.println("Masa Akhir Kontrak: " + akhirKontrak);
        System.out.println("Tunjangan: " + hitungTunjangan(0.025));
    }
}

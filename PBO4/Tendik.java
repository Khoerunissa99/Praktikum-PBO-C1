// Nama : Khoerunissa Billah Wahyu Sarbini
// Nim: 24060123140178
// File : Tendik.java
// Lab C1

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;


public class Tendik extends Pegawai {
    private String bidang;
    private final int bup = 55;


    public Tendik(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, int gajiPokok, String bidang) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.bidang = bidang;
    }

    public String getBidang() {
        return bidang;
    }
    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    public int hitungTunjangan() {
        return super.hitungTunjangan(0.01);
    }

    public void printBUP() {
        LocalDate bupDate = getTanggalLahir().plusYears(bup).with(TemporalAdjusters.firstDayOfNextMonth());
        Locale locale = Locale.forLanguageTag("id-ID");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", locale);
        System.out.println("BUP Tendik: " + bupDate.format(formatter));
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jabatan: Tendik");
        System.out.println("Bidang: " + bidang);
        System.out.println("Tunjangan: " + hitungTunjangan());
    }
}

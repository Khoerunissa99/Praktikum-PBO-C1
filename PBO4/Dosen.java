// Nama : Khoerunissa Billah Wahyu Sarbini
// Nim: 24060123140178
// File : Dosen.java
// Lab C1

import java.time.LocalDate;

public class Dosen extends Pegawai {
    private String fakultas;

    public Dosen(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, int gajiPokok, String fakultas) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.fakultas = fakultas;
    }

    public String getFakultas(){
        return fakultas;
    }

    public void setFakultas(String fakultas){
        this.fakultas = fakultas;
    }    

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Fakultas: " + fakultas);
    }
    
}
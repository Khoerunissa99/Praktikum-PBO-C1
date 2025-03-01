// Nama : Khoerunissa Billah Wahyu Sarbini
// Nim : 24060123140178
// File : Mahasiswa.java
// Lab C1

import java.util.ArrayList;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    //Konstruktor tanpa parameter.
    public Mahasiswa() {
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.listMatkul = new ArrayList<>();
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }
    
    //Konstruktor dengan parameter.
    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>();
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }

    //Selektor dan mutator
    public String getNama(){
        return  nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNim(){
        return nim;
    }

    public void setNim(String nim){
        this.nim = nim;
    }

    public String getprodi(){
        return prodi;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    public void setDosenWali(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }


    public void addMatkul(MataKuliah newMataKuliah){
        listMatkul.add(newMataKuliah);
    }

    public int getJumlahSKS() {
        int totalSKS = 0;
        for (MataKuliah mk : listMatkul) {
            totalSKS += mk.getSks();
        }
        return totalSKS;
    }

    public int getJumlahMatKul() {
        return listMatkul.size();
    }

    public void printMhs() {
        System.out.println("NIM  : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Prodi: " + prodi);
    }

    public void printDetailMhs(){
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Prodi : " + prodi);
        int i ;
        for (i=0;i<listMatkul.size();i++){
            System.out.println(listMatkul.get(i).getNama());
        }
        System.out.println("Total SKS: " + getJumlahSKS());
        System.out.println("Dosen Wali: " + dosenWali.getNama());
        System.out.println("Kendaraan : " + kendaraan.getnoPlat());
    }
}




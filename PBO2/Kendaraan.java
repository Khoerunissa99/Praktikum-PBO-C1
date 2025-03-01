// Nama : Khoerunissa Billah Wahyu Sarbini
// Nim : 24060123140178
// File : Kendaraan.java
// Lab C1

public class Kendaraan {
    private String noPlat;
    private String jenisKendaraan; 

    //Konstruktor tanpa parameter.
    public Kendaraan() {
        this.noPlat = "";
        this.jenisKendaraan = "";
    }

    //Konstruktor dengan parameter.
    public Kendaraan (String noPlat, String jenisKendaraan) {
        this.noPlat = noPlat;
        this.jenisKendaraan = jenisKendaraan;
    }

    //Selektor dan mutator
    public String getnoPlat(){
        return noPlat;
    }

    public void setNoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    public String getJenisKendaraan(){
        return jenisKendaraan;
    }

    public void setJenisKendaraan(String jenisKendaraan){
        this.jenisKendaraan = jenisKendaraan;
    }
}
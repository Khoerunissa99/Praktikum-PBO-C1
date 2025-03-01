// Nama : Khoerunissa Billah Wahyu Sarbini
// Nim : 24060123140178
// File : Dosen.java
// Lab C1

public class Dosen {
    private String nip;
    private String nama;
    private String prodi;

    //Konstruktor tanpa parameter.
    public Dosen() {
        this.nip = "";
        this.nama = "";
        this.prodi = "Umum";
    }
    
    //Konstruktor dengan parameter.
    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }
    
    //Selektor dan mutator
    
    public String getNip(){
        return nip;
    }

    public void setNip(String nip){
        this.nip = nip;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String prodi(){
        return prodi;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }
}


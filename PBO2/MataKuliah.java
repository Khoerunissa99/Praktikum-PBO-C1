// Nama : Khoerunissa Billah Wahyu Sarbini
// Nim : 24060123140178
// File : MataKuliah.java
// Lab C1

public class MataKuliah {
    private String idMatKul;
    private String nama;
    private Integer sks;

    //Konstruktor tanpa parameter.
    public MataKuliah(){
        this.idMatKul = "";
        this.nama = "";
        this.sks = 0;
    }

    //Konstruktor dengan parameter.
    public MataKuliah(String idMatKul, String nama, Integer sks) {
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }

    //Selektor dan mutator
    public String getIdMatKul(){
        return idMatKul;
    }

    public void setIdMatKul(String idMatKul){
        this.idMatKul = idMatKul;
    }

    public String getNama(){
        return nama;
    }

    public void getNama(String getNama){
        this.nama = getNama;
    }

    public Integer getSks(){
        return sks;
    }

    public void getSks(Integer getSks){
        this.sks = getSks;
    }
}

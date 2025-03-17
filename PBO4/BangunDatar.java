// Nama : Khoerunissa Billah Wahyu Sarbini
// Nim: 24060123140178
// File : BangunDatar.java
// Lab C1

public class BangunDatar {
    private int jmlSisi;
    private String warna;
    private String border;

    public BangunDatar(){
    }

    public int getJmlSisi(){
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi){
        this.jmlSisi = jmlSisi;
    }

    public String getWarna (){
        return warna;
    }

    public void setWarna(String warna){
        this.warna = warna;
    }

    public String getBorder(){
        return border;
    }

    public void setBorder(String border){
        this.border = border;
    }


    public void printInfo(){
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }
}
// Nama : Khoerunissa Billah Wahyu Sarbini
// Nim: 24060123140178
// File : Persegi.java
// Lab C1

public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(){
        setJmlSisi(4);
    }

    public Persegi(double sisi, String warna, String border){
        this.sisi = sisi;
        setWarna(warna);
        setBorder(border);
        setJmlSisi(4);
    }

    public double getSisi(){
        return sisi;
    }

    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    public double getLuas() {
        return sisi * sisi;
    }
    
    public double getKeliling(){
        return 4*sisi;
    }

    public double getDiagonal(){
        return Math.sqrt(2)*sisi;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        // System.out.println("Jumlah sisi: " + getJmlSisi());
        // System.out.println("Warna: " + getWarna());
        // System.out.println("Border: " + getBorder());
        System.out.println("Sisi: " + getSisi());
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
        System.out.println("Diagonal: " + getDiagonal());
    }
}

// Nama : Khoerunissa Billah Wahyu Sarbini
// Nim: 24060123140178
// File : Lingkaran.java
// Lab C1

public class Lingkaran extends BangunDatar {
    private double jari;

    public Lingkaran(){
        setJmlSisi(0);
    }

    public Lingkaran(double jari, String warna, String border){
        this.jari = jari;
        setWarna(warna);
        setBorder(border); 
        setJmlSisi(0);
    }

    public double getJari(){
        return jari;
    }

    public void setJari(double jari){
        this.jari = jari;
    }

    public double getLuas(){
        return Math.PI *jari*jari;
    }

    public double getKeliling(){
        return Math.PI*2*jari;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        // System.out.println("jari: " + getJari());
        // System.out.println("Luas: " + getLuas());
        // System.out.println("Warna: " + getWarna());
        // System.out.println("Border: " + getBorder());
        System.out.println("Keliling: " + getKeliling());
        System.out.println("Jari-jari : " + jari);
    }
    
}

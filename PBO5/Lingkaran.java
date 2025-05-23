// Nama : Khoerunissa Billah Wahyu Sarbini
// Nim : 24060123140178
// File : Lingkaran.java

public class Lingkaran extends BangunDatar implements IResize {
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
    
    @Override
    public void zoomIn(){
        jari = jari * 1.1;
    }

    @Override
    public void zoomOut(){
        jari = jari * 0.9;
    }

    @Override
    public void zoom(int percent){
        jari = jari * percent / 100;
    }
}

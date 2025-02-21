// Nama File : Garis.java
// Nama : Khoerunissa Billah Wahyu Sarbini
// Nim : 24060123140178
// Tanggal : 21 Februari 2025


public class Garis {
    private Titik awal, akhir;
    private static int counterGaris = 0;
    
    public Garis() {
        this(new Titik(0, 0), new Titik(1, 1));
    }
    
    public Garis(Titik awal, Titik akhir) {
        this.awal = awal;
        this.akhir = akhir;
        counterGaris++;
    }
    
    public Titik getAwal() { 
        return awal; 
    }
    public Titik getAkhir() { 
        return akhir; 
    }
    public void setAwal(Titik awal) { 
        this.awal = awal; 
    }
    public void setAkhir(Titik akhir) { 
        this.akhir = akhir; 
    }
    public static int getCounterGaris() { 
        return counterGaris; 
    }
    
    public double panjangGaris() {
        double dx = akhir.getAbsis() - awal.getAbsis();
        double dy = akhir.getOrdinat() - awal.getOrdinat();
        return Math.sqrt((dx * dx) + (dy * dy));
    }
    
    public double gradien() {
        double X = akhir.getAbsis() - awal.getAbsis();
        if (X == 0) {
            System.out.println("Nilai x1 dan x2 sama, pembagian nol");
        }
        return (akhir.getOrdinat() - awal.getOrdinat()) / X;
    }
    
    public Titik titikTengah() {
        return new Titik((awal.getAbsis() + akhir.getAbsis()) / 2, (awal.getOrdinat() + akhir.getOrdinat()) / 2);
    }
    
    public boolean sejajar(Garis g) {
        return this.gradien() == g.gradien();
    }
    
    public boolean tegakLurus(Garis g) {
        return this.gradien() * g.gradien() == -1;
    }
    
    public void tampilkanTitik() {
        System.out.println("Titik Awal: (" + awal.getAbsis() + ", " + awal.getOrdinat() + ")");
        System.out.println("Titik Akhir: (" + akhir.getAbsis() + ", " + akhir.getOrdinat() + ")");
    }
    
    public String persamaanGaris() {
        double m = gradien();
        double c = awal.getOrdinat() - m * awal.getAbsis();
        return "y = " + m + "x + " + c;
    }
}

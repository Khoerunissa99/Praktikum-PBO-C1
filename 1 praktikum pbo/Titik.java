// Nama File : Titik.java
// Nama : Khoerunissa Billah Wahyu Sarbini
// Nim : 24060123140178
// Tanggal : 21 Februari 2025

public class Titik{
    double absis;
    double ordinat;
    static int counterTitik = 0;

    Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    double getAbsis(){
        return absis;
    }

    double getOrdinat(){
        return ordinat;
    }

    void setAbsis(double x){
        absis = x;
    }

    void setOrdinat(double y){
        ordinat = y;
    }

    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    public int getKuadran(){
        if (absis > 0 && ordinat > 0) {
            return 1;
        } else if (absis < 0 && ordinat > 0) {
            return 2;
        } else if (absis < 0 && ordinat < 0) {
            return 3;
        } else if (absis > 0 && ordinat < 0) {
            return 4;
        } else {
            return 0; 
        }
    }

    public double getJarakPusat(){
        return Math.sqrt(this.absis * this.absis + this.ordinat * this.ordinat);
    }

    public double getJarak(Titik T) {
        double deltaX = T.absis - this.absis;
        double deltaY = T.ordinat - this.ordinat;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public void refleksiX() {
        this.absis = this.absis * -1;
    }
    
    public void refleksiY() {
        this.ordinat = this.ordinat * -1;
    }

    public Titik getRefleksiX(){
        return new Titik(absis, -ordinat);
    }

    public Titik getRefleksiY(){
        return new Titik(-absis, ordinat);
    }

    public void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    public static int getCounterTitik(){
        return counterTitik;
    }
}
// Nama : Khoerunissa Billah Wahyu Sarbini
// Nim: 24060123140178
// File : Titik.java
// Lab C1

public class Titik{
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    
    public Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    public Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    public double getAbsis(){
        return absis;
    }

    public double getOrdinat(){
        return ordinat;
    }

    public void setAbsis(double x){
        absis = x;
    }

    public void setOrdinat(double y){
        ordinat = y;
    }

    public void geser(double x, double y){
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
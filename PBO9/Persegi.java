// Nama : Khoerunissa Billah Wahyu Sarbini
// Nim : 24060123140178
// File : Persegi.java

public class Persegi<T extends Number> extends BangunDatarGenerik<T> {
    public Persegi(T sisi) {
        super(sisi, sisi);
    }
    
    @Override
    public double hitungLuas() {
        double sisi = parameter1.doubleValue();
        return sisi * sisi;
    }
    
    @Override
    public double hitungKeliling() {
        return 4 * parameter1.doubleValue();
    }
    
    @Override
    public String toString() {
        return "Persegi dengan sisi = " + parameter1 + 
               "\nLuas = " + hitungLuas() +
               "\nKeliling = " + hitungKeliling();
    }
}

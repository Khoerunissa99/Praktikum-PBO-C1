// Nama : Khoerunissa Billah Wahyu Sarbini
// Nim : 24060123140178
// File : Segitiga.java

public class Segitiga<T extends Number> extends BangunDatarGenerik<T> {
    private T parameter3; 
    public Segitiga(T alas, T tinggi, T sisiKetiga) {
        super(alas, tinggi);
        this.parameter3 = sisiKetiga;
    }
    
    public T getParameter3() {
        return parameter3;
    }
    
    public void setParameter3(T parameter3) {
        this.parameter3 = parameter3;
    }
    
    @Override
    public double hitungLuas() {
        return 0.5 * parameter1.doubleValue() * parameter2.doubleValue();
    }
    
    @Override
    public double hitungKeliling() {
        return parameter1.doubleValue() + parameter2.doubleValue() + parameter3.doubleValue();
    }
    
    @Override
    public String toString() {
        return "Segitiga dengan alas = " + parameter1 + ", tinggi = " + parameter2 + 
               ", dan sisi ketiga = " + parameter3 +
               "\nLuas = " + hitungLuas() +
               "\nKeliling = " + hitungKeliling();
    }
}
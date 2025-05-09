// Nama : Khoerunissa Billah Wahyu Sarbini
// Nim : 24060123140178
// File : PersegiPanjang.java

public class PersegiPanjang<T extends Number> extends BangunDatarGenerik<T> {
    public PersegiPanjang(T panjang, T lebar) {
        super(panjang, lebar);
    }
    
    @Override
    public double hitungLuas() {
        return parameter1.doubleValue() * parameter2.doubleValue();
    }
    
    @Override
    public double hitungKeliling() {
        return 2 * (parameter1.doubleValue() + parameter2.doubleValue());
    }
    
    @Override
    public String toString() {
        return "Persegi Panjang dengan panjang = " + parameter1 + " dan lebar = " + parameter2 +
               "\nLuas = " + hitungLuas() +
               "\nKeliling = " + hitungKeliling();
    }
}
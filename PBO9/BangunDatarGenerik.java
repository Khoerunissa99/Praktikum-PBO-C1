// Nama File : BangunDatarGenerik.java
// Nama : Khoerunissa Billah Wahyu Sarbini
// Nim : 24060123140178
// Lab C1


public abstract class BangunDatarGenerik<T extends Number> {
    protected T parameter1;
    protected T parameter2;
    
    public BangunDatarGenerik(T parameter1, T parameter2) {
        this.parameter1 = parameter1;
        this.parameter2 = parameter2;
    }
    
    public abstract double hitungLuas();
    public abstract double hitungKeliling();
    
    public T getParameter1() {
        return parameter1;
    }
    
    public void setParameter1(T parameter1) {
        this.parameter1 = parameter1;
    }
    
    public T getParameter2() {
        return parameter2;
    }
    
    public void setParameter2(T parameter2) {
        this.parameter2 = parameter2;
    }
}

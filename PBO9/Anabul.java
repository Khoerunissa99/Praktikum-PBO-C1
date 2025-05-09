// Nama File : Anabul.java
// Nama : Khoerunissa Billah Wahyu Sarbini
// Nim : 24060123140178
// Lab C1

public abstract class Anabul {
    protected String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public abstract void bersuara();
    public abstract void bergerak();
}

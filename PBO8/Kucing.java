// Nama File : Kucing.java
// Nama : Khoerunissa Billah Wahyu Sarbini
// Nim : 24060123140178
// Lab C1

public class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara : 'Meong'");
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " bergerak melata.");
    }
}
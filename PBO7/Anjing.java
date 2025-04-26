// Nama File : Anjing.java
// Nama : Khoerunissa Billah Wahyu Sarbini
// Nim : 24060123140178
// Lab C1

public class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara : 'Guk-guk'");
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " bergerak melata.");
    }
}

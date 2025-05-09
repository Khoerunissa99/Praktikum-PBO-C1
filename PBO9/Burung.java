// Nama File : Burung.java
// Nama : Khoerunissa Billah Wahyu Sarbini
// Nim : 24060123140178
// Lab C1

public class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara : 'Cuit'");
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " bergerak terbang.");
    }
}


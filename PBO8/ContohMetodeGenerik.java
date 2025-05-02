// Nama File : ContohMetodeGenerik.java
// Nama : Khoerunissa Billah Wahyu Sarbini
// Nim : 24060123140178
// Lab C1

public class ContohMetodeGenerik {
    public static <T extends Anabul> void tampilkanPerilaku(Datum<T> data) {
        data.getIsi().bersuara();
        data.getIsi().bergerak();
    }
}

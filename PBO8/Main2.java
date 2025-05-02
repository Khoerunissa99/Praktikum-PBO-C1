// Nama File : Main2.java
// Nama : Khoerunissa Billah Wahyu Sarbini
// Nim : 24060123140178
// Lab C1

public class Main2 {
    public static void main(String[] args) {
        Datum<Kucing> datumKucing = new Datum<>();
        datumKucing.setIsi(new Kucing("Yanto"));

        Datum<Anjing> datumAnjing = new Datum<>();
        datumAnjing.setIsi(new Anjing("Nito"));

        Datum<Burung> datumBurung = new Datum<>();
        datumBurung.setIsi(new Burung("Lala"));

        ContohMetodeGenerik.tampilkanPerilaku(datumKucing);
        ContohMetodeGenerik.tampilkanPerilaku(datumAnjing);
        ContohMetodeGenerik.tampilkanPerilaku(datumBurung);
    }
}

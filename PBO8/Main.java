// Nama File : Main.java
// Nama : Khoerunissa Billah Wahyu Sarbini
// Nim : 24060123140178
// Lab C1

public class Main {
    public static void main(String[] args) {
        Datum<Anabul> data1 = new Datum<>();
        data1.setIsi(new Kucing("Yanto"));
        data1.getIsi().bersuara();
        data1.getIsi().bergerak();

        Datum<Anabul> data2 = new Datum<>();
        data2.setIsi(new Anjing("Nito"));
        data2.getIsi().bersuara();
        data2.getIsi().bergerak();

        Datum<Anabul> data3 = new Datum<>();
        data3.setIsi(new Burung("Lala"));
        data3.getIsi().bersuara();
        data3.getIsi().bergerak();
    }
}

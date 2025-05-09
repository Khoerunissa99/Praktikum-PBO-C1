// Nama File : MainAnabul.java
// Nama : Khoerunissa Billah Wahyu Sarbini
// Nim : 24060123140178
// Lab C1

public class MainAnabul {
    public static void main(String[] args) {
        Anabul[] hewanPeliharaan = {
            new Kucing("Yanto"),
            new Anjing("Nito"),
            new Burung("Lalala")
        };

        for (Anabul anabul : hewanPeliharaan) {
            anabul.bersuara();
            anabul.bergerak();
            System.out.println();
        }
    }
}

// Nama File : MGaris.java
// Nama : Khoerunissa Billah Wahyu Sarbini
// Nim : 24060123140178
// Tanggal : 21 Februari 2025


public class MGaris {
    public static void main(String[] args) {
        Garis g1 = new Garis(new Titik(-2, 0), new Titik(0, 4));
        Garis g2 = new Garis(new Titik(1, 2), new Titik(3, 6));  
            g1.tampilkanTitik();

            //menguji metode panjangGaris
            System.out.println("\nPanjang Garis: " + g1.panjangGaris());

            //menguji metode gradien
            System.out.println("\nGradien Garis: " + g1.gradien());

            //menguji metode Titik Tengah Garis
            System.out.println("\nTitik Tengah Garis: (" + g1.titikTengah().getAbsis() + ", " + g1.titikTengah().getOrdinat() + ")");
            
            //menguji metode sejajar
            System.out.println("\nGaris g1 sejajar dengan Garis g2? " + g1.sejajar(g2));
            
            //menguji metode tegak lurus
            System.out.println("\nGaris g1 tegak lurus dengan Garis g2? " + g1.tegakLurus(g2));
            
            //menguji metode persamaan garis
            System.out.println("\nPersamaan Garis: " + g1.persamaanGaris());
            
            //menguji metode getCounterGaris
            System.out.println("\nTotal Garis yang Dibuat: " + Garis.getCounterGaris());
    }
}


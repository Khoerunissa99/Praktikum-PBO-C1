// Nama File : KoleksiAnabul.java
// Nama : Khoerunissa Billah Wahyu Sarbini
// Nim : 24060123140178
// Lab C1


import java.util.Random;

public class KoleksiAnabul {
    public static void main(String[] args) {
        Koleksi<Anabul> koleksiAnabul = new Koleksi<>(10);
    
        String[] namaKucing = {"Lala", "Neko", "Wanto", "Hanin"};
        String[] namaAnjing = {"Lili", "Roka", "Khal", "Jiji"};
        String[] namaBurung = {"Lulu", "Gigu", "Poluin", "Sanny"};
        
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int tipe = rand.nextInt(3); 
            
            switch (tipe) {
                case 0:
                    String namaK = namaKucing[rand.nextInt(namaKucing.length)];
                    koleksiAnabul.add(new Kucing(namaK + "-" + i));
                    break;
                case 1:
                    String namaA = namaAnjing[rand.nextInt(namaAnjing.length)];
                    koleksiAnabul.add(new Anjing(namaA + "-" + i));
                    break;
                case 2:
                    String namaB = namaBurung[rand.nextInt(namaBurung.length)];
                    koleksiAnabul.add(new Burung(namaB + "-" + i));
                    break;
            }
        }
        System.out.println("---KOLEKSI ANABUL---");
        customShowAll(koleksiAnabul);
    }
    private static void customShowAll(Koleksi<Anabul> koleksi) {
        for (int i = 0; i < koleksi.getSize(); i++) {
            Anabul anabul = koleksi.getIsi(i);
            System.out.println("\n[" + i + "] " + anabul);
            anabul.bergerak();
            anabul.bersuara();
        }
    }
}
    
    
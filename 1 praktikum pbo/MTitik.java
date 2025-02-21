// Nama File : MTitik.java
// Nama : Khoerunissa Billah Wahyu Sarbini
// Nim : 24060123140178
// Tanggal : 21 Februari 2025

public class MTitik {
    public static void main(String[] args){
        Titik T1 = new Titik();
        Titik T2 = new Titik(2,3);

        //menguji setabsis T1

        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3,4);
        T1.printTitik();

        //menguji setabsis T2

        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();
        System.out.println("\nJumlah Objek Titik = " + Titik.getCounterTitik());
        
        
        // Menguji metode getJarakPusat
        System.out.println("\nJarak titik1 ke pusat: " + T1.getJarakPusat());
        System.out.println("Jarak titik2 ke pusat: " + T2.getJarakPusat());

        // Menguji metode getJarak
         System.out.println("\nJarak antara titik1 dan titik2: " + T1.getJarak(T2));

    // Menguji metode refleksi
        // Refleksi terhadap sumbu X
        T1.refleksiX();
        System.out.println("\nrefleksi terhadap X: (" + T1.getAbsis() + ", " + T1.getOrdinat() + ")");

        // Refleksi terhadap sumbu Y
        T1.refleksiY();
        System.out.println("\nrefleksi terhadap Y: (" + T1.getAbsis() + ", " + T1.getOrdinat() + ")");

        //Menguji metode geser
        T2.geser(3, -2);
        T2.printTitik();
        System.out.println("\nMenggeser titik2 sebanyak (3, -2):");

        // Menguji metode getKuadran
        System.out.println("\nKuadran titik1: " + T1.getKuadran());
        System.out.println("Kuadran titik2 setelah digeser: " + T2.getKuadran());

        // Menguji jumlah titik yang telah dibuat
        System.out.println("\nTotal titik yang telah dibuat: " + Titik.getCounterTitik());

    }
}

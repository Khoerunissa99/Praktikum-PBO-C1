// Nama : Khoerunissa Billah Wahyu Sarbini
// Nim : 24060123140178
// File : MainKoleksi.java

public class MainKoleksi {
    public static void main(String[] args) {
        Koleksi<Character> koleksiChar = new Koleksi<>(10);
        koleksiChar.add('K');
        koleksiChar.add('H');
        koleksiChar.add('O');
        koleksiChar.add('E');
        koleksiChar.add('R');
        koleksiChar.add('U');
        koleksiChar.add('N');
        koleksiChar.add('I');
        koleksiChar.add('S');
        koleksiChar.add('A');
        

        System.out.println("--KOLEKSI AWAL---");
        koleksiChar.showAll();
        
        System.out.println("\nNilai indeks ke-2: " + koleksiChar.getIsi(2));
        
        koleksiChar.setIsi(7, 'B');
        System.out.println("\n---SETELAH DIEDIT---");
        koleksiChar.showAll();
    
        koleksiChar.delete(7);
        System.out.println("\n---SETELAH DELETE---");
        koleksiChar.showAll();
        
        koleksiChar.add('W');
        System.out.println("\n---SETELAH ADD---");
        koleksiChar.showAll();
        
        System.out.println("\nJumlah elemen saat ini: " + koleksiChar.getSize());
        koleksiChar.showAll();
    }
}
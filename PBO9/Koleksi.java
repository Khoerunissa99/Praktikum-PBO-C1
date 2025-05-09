// Nama File : Koleksi.java
// Nama : Khoerunissa Billah Wahyu Sarbini
// Nim : 24060123140178
// Lab C1


public class Koleksi<T> {
    private int nbelm;
    private Object[] wadah; 
    public Koleksi(int capacity) {
        this.nbelm = 0;
        this.wadah = new Object[capacity];
    }
    
    public T getIsi(int indeks) {
        if (indeks >= 0 && indeks < nbelm) {
            Object obj = wadah[indeks];
            T hasil = (T) obj;
            return hasil;
        }
        return null;
    }
    

    public void setIsi(int indeks, T nilai) {
        if (indeks >= 0 && indeks < nbelm) {
            wadah[indeks] = nilai;
        } else {
            System.out.println("Indeks tidak valid!");
        }
    }
    

    public int getSize() {
        return nbelm;
    }
    
    public void setSize(int size) {
        if (size >= 0 && size <= wadah.length) {
            this.nbelm = size;
        } else {
            System.out.println("Ukuran tidak valid!");
        }
    }
    
    public void add(T nilai) {
        if (nbelm < wadah.length) {
            wadah[nbelm] = nilai;
            nbelm++;
        } else {
            System.out.println("Koleksi sudah penuh!");
        }
    }
    
    public void delete(int indeks) {
        if (indeks >= 0 && indeks < nbelm) {
            for (int i = indeks; i < nbelm - 1; i++) {
                wadah[i] = wadah[i + 1];
            }
            wadah[nbelm - 1] = null;
            nbelm--; 
        } else {
            System.out.println("Indeks tidak valid!");
        }
    }
    
    public void showAll() {
        System.out.println("Isi koleksi:");
        for (int i = 0; i < nbelm; i++) {
            System.out.println("[" + i + "] " + wadah[i]);
        }
        System.out.println("Jumlah elemen: " + nbelm);
    }
}
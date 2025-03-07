// Nama : Khoerunissa Billah Wahyu Sarbini
// NIM  : 24060123140178
// Lab : C1
// File : Aser.java

public class Aser{
    public static void main(String[] args) {
        int x=0;
        if (x>0){
            System.out.println("x bilangan positif");
        }else{
            assert(x<0): "ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}

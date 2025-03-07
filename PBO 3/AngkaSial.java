// Nama : Khoerunissa Billah Wahyu Sarbini
// Nim : 24060123140178
// File : AngkaSial.java  

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka==13){
            throw new AngkaSialException();
        }
        System.out.println(angka +" bukan angka sial");
    }


    public static void main (String[] args) {
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException ase){
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukan angka!!!");
        }
    } 
}

// *Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
//  pada baris 12 tidak akan dieksekusi jika angkanya adalah 13,
//  exception akan dilempar pada baris 9 sehingga baris 12 tidak dijalankan. 
//  Namun jika angka bukan 13 maka baris 12 akan dijalankan.

// *Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
// Baris 21 akan dieksekusi jika terjadi exception karena menangani yang dilempar dari dalam try.
// setelah exception terjadi, program melompat keluar dari try langsung ke catch dan mengeksekusi kode di dalamnya.
// dan jika tidak terjadi exception maka baris 21 tidak akan dijalankan.

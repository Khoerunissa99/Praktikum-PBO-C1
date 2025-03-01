// Nama : Khoerunissa Billah Wahyu Sarbini
// Nim : 24060123140178
// File : Main Mahasiswa.java 
// Lab C1

public class MMahasiswa {
  
    public static void main(String[] args) {
        MataKuliah matkul1 = new MataKuliah("PBO", "Pemrograman Berbasis Objek", 3);
        MataKuliah matkul2 = new MataKuliah("MBD", "Manajemen Basis Data", 3);
        Mahasiswa mhs1 = new Mahasiswa("4178", "nisa", "Informatika");
        Dosen dosen1 = new Dosen("0121", "Jihan", "Informatika");
        Kendaraan kendaraan1 = new Kendaraan("H 1234 CDL", "Mobil");
        mhs1.setDosenWali(dosen1);
        mhs1.setKendaraan(kendaraan1);
        mhs1.addMatkul(matkul1);
        mhs1.addMatkul(matkul2);
        mhs1.printDetailMhs();    
        System.out.println("Jumlah Mata Kuliah = " + mhs1.getJumlahMatKul());
        System.out.println("Jumlah SKS Kuliah = " + mhs1.getJumlahSKS());
    }
    
}

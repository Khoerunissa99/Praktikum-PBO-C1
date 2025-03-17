// Nama : Khoerunissa Billah Wahyu Sarbini
// Nim: 24060123140178
// File : main.java
// Lab C1

import java.time.LocalDate;

public class main { 
    public static void main(String[] args) {
        System.out.println("\n========================= Daftar Pegawai Universitas Diponogoro =========================\n");

        DosenTetap dosenTetap = new DosenTetap(
            "954547548", "Andi", LocalDate.of(1990, 5, 5),
            LocalDate.of(2015, 1, 1), 5000000, 
            "Fakultas Sains dan Matematika", "78647324"
        );

        DosenTamu dosenTamu = new DosenTamu(
            "123456789", "Kiki", LocalDate.of(2000, 1, 7),
            LocalDate.of(2025, 2, 11), 3400000, 
            "Fakultas Perikanan", "78654321", 
            LocalDate.of(2025, 12, 31) 
        );

        Tendik tendik = new Tendik(
            "9988877621", "Gusti", LocalDate.of(1997, 12, 28),
            LocalDate.of(2011, 7, 20), 4000000, "Administrasi"
        );

        System.out.println("Informasi Dosen Tetap:");
        dosenTetap.printInfo();
        System.out.println("\nInformasi Dosen Tamu:");
        dosenTamu.printInfo();
        System.out.println("\nInformasi Tendik:");
        tendik.printInfo();
    }
}

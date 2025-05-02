/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanmeduim;

/**
 *
 * @author ASUS
 */
public class KontrolSenjata {
    private Senjata senjata;

    public KontrolSenjata(Senjata s) {
        this.senjata = s;
    }

    public boolean isAdaPeluru() {
        return senjata.getPeluru() > 0;
    }

    public void isiPeluru(int jmlPeluru) {
        System.out.println(">> Peluru berhasil ditambah: " + jmlPeluru);
        senjata.setPeluru(senjata.getPeluru() + jmlPeluru);
    }

    public void menembak(int jumlah) {
        System.out.println(">> Siap menembak " + jumlah + " kali");
        if (!isAdaPeluru()) {
            System.out.println("Peluru Habis");
            return;
        }

        for (int i = 0; i < jumlah; i++) {
            if (isAdaPeluru()) {
                System.out.println(senjata.getBunyi());
                senjata.setPeluru(senjata.getPeluru() - 1);
            } else {
                System.out.println("Gagal tembak, Peluru Habis");
            }
        }

        System.out.println(">> Peluru sisa: " + senjata.getPeluru());
    }

    public String menusuk() {
        return senjata.isMenusuk() ? "Menusuk!" : "Tidak bisa menusuk";
    }

    public void pasangBayonet() {
        senjata.setMenusuk(true);
    }
}

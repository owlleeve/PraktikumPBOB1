/* Nama File    : Teman.java
 * Deskripsi    : Kelas koleksi daftar nama teman menggunakan ArrayList
 * Pembuat      : Olivia Oktaviani (24060124120050)
 * Tanggal      : 7 Mei 2026
 */
package PBO09_24060124120050;

import java.util.ArrayList;

public class Teman {
    // ATRIBUT
    private int nbelm;
    private ArrayList<String> Lnama;

    // KONSTRUKTOR
    public Teman() {
        Lnama = new ArrayList<>();
        nbelm = 0;
    }

    // a. getNbelm() - mengembalikan banyaknya elemen
    public int getNbelm() {
        return nbelm;
    }

    // b. getNama(indeks) - mengambil nama pada indeks tertentu
    public String getNama(int indeks) {
        if (indeks < 0 || indeks >= nbelm) {
            System.out.println("Indeks " + indeks + " di luar jangkauan!");
            return null;
        }
        return Lnama.get(indeks);
    }

    // c. setNama(indeks, nama) - mengubah nama pada indeks tertentu
    public void setNama(int indeks, String nama) {
        if (indeks < 0 || indeks >= nbelm) {
            System.out.println("Indeks " + indeks + " di luar jangkauan!");
            return;
        }
        Lnama.set(indeks, nama);
    }

    // d. addNama(nama) - menambah nama ke koleksi
    public void addNama(String nama) {
        Lnama.add(nama);
        nbelm++;
    }

    // e. delNama(nama) - menghapus nama dari koleksi
    public void delNama(String nama) {
        if (Lnama.remove(nama)) {
            nbelm--;
        } else {
            System.out.println("Nama '" + nama + "' tidak ditemukan!");
        }
    }

    // f. isMember(nama) - mengecek apakah nama ada dalam koleksi
    public boolean isMember(String nama) {
        return Lnama.contains(nama);
    }

    // g. gantiNama(nama, namaBaru) - mengganti nama lama dengan nama baru
    public void gantiNama(String nama, String namaBaru) {
        this.Lnama.set(this.Lnama.indexOf(nama), namaBaru);
    }

    // h. countNama(nama) - menghitung kemunculan nama dalam koleksi
    public int countNama(String nama) {
        int count = 0;
        for (String n : Lnama) {
            if (n == nama) {
                count++;
            }
        }
        return count;
    }

    // i. showTeman() - menampilkan semua nama teman
    public void showTeman() {
        for (String n : Lnama) {
            System.out.println(n);
        }
    }
}
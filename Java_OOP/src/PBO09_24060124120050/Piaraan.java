/* Nama File    : Piaraan.java
 * Deskripsi    : Kelas koleksi antrean hewan peliharaan (Anabul) menggunakan LinkedList
 * Pembuat      : Olivia Oktaviani (24060124120050)
 * Tanggal      : 11 Mei 2026
 */
package PBO09_24060124120050;

import java.util.LinkedList;

public class Piaraan {
    // ATRIBUT
    private int nbelm;
    private LinkedList<Anabul> Lanabul;

    // METHOD
    // konstruktor tanpa parameter
    public Piaraan() {
        Lanabul = new LinkedList<>();
        nbelm = 0;
    }

    // i. getNbelm() - mengembalikan banyaknya elemen dalam antrean
    public int getNbelm() {
        return nbelm;
    }

    // ii. enqueueAnabul(anabul) - menambah elemen di akhir antrean
    public void enqueueAnabul(Anabul a) {
        Lanabul.addLast(a);
        nbelm++;
    }

    // iii. isMember(anabul) - mengecek apakah anabul ada dalam antrean
    public boolean isMember(Anabul a) {
        return Lanabul.contains(a);
    }

    // iv. getAnabul() - mengambil data anabul pertama tanpa mengeluarkannya
    public Anabul getAnabul() {
        if (nbelm == 0) {
            System.out.println("Antrean kosong!");
            return null;
        }
        return Lanabul.getFirst();
    }

    // v. dequeueAnabul() - mengambil anabul pertama sekaligus mengeluarkannya
    public Anabul dequeueAnabul() {
        if (nbelm == 0) {
            System.out.println("Antrean kosong!");
            return null;
        }
        nbelm--;
        return this.Lanabul.poll();
    }

    // c. showAnabul() - menampilkan nama panggilan semua anabul dalam antrean
    public void showAnabul() {
        for (Anabul a : Lanabul) {
            System.out.println(a.getNama());
        }
    }

    // d. countKucing() - menghitung banyak objek keluarga kucing dalam antrean
    public int countKucing() {
        int count = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                count++;
            }
        }
        return count;
    }

    // e. bobotKucing() - menghitung total bobot keluarga kucing dalam antrean
    public double bobotKucing() {
        double totalBobot = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                totalBobot += ((Kucing) a).getBerat();
            }
        }
        return totalBobot;
    }

    // show bobot kucing
        public void showBobotKucing() {
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                System.out.println(a.getNama() + " (" + a.getClass().getSimpleName() + "): " + a.getBerat() + " kg");
            }
        }
        System.out.println("Total bobot kucing: " + bobotKucing() + " kg");
    }

    // f. showJenisAnabul() - menampilkan nama panggilan beserta jenis kelas objeknya
    public void showJenisAnabul() {
    for (Anabul a : Lanabul) {
        System.out.println(a.getNama() + ", " + a.getClass().getSimpleName());
    }
}
}
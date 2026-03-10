/* Nama File: MGaris.java
 * Deskripsi: untuk membuat dan menampilkan garis dalam program
 * Pembuat: Olivia Oktaviani
 * Tanggal: 3 Maret 2026
 */

package Pertemuan2;

public class MGaris {

    public static void main(String[] args) {
        Titik t1 = new Titik(-2,0);
        Titik t2 = new Titik(0,4);
        Garis g1 = new Garis(t1, t2);

        g1.printGaris();
        System.out.println("Panjang: " + g1.getPanjang());
        System.out.println("Gradien: " + g1.getGradien());

        Titik tengah = g1.getTitikTengah();
        System.out.println("Titik Tengah: (" + tengah.getAbsis() + "," + tengah.getOrdinat() + ")");

        System.out.println("Persamaan: " + g1.getPersamaan());
        System.out.println("Jumlah objek garis: " + Garis.getCounterGaris());

        Titik t3 = new Titik(1, 0);
        Titik t4 = new Titik(3, 4);
        Garis g2 = new Garis(t3, t4);

        System.out.println("G1 sejajar G2? " + g1.isSejajar(g2));
        System.out.println("G1 tegak lurus G2? " + g1.isTegakLurus(g2));
    }
}
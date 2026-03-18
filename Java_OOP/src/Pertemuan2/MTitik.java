/* Nama File: MTitik.java
 * Deskripsi: untuk membuat dan menampilkan titik dalam program
 * Pembuat: Olivia Oktaviani
 * Tanggal: 1 Maret 2026
 */

package Pertemuan2;

public class MTitik {
    public static void main(String[] args) {

        Titik t1 = new Titik(3, 4);

        System.out.println("Absis: " + t1.getAbsis());
        System.out.println("Ordinat: " + t1.getOrdinat());
        System.out.println("Kuadran: " + t1.getKuadran());
        System.out.println("Jarak ke pusat: " + t1.getJarakPusat());
        System.out.println();
        t1.geser(2, 1);
        System.out.println("Setelah digeser sejauh (2,1):");
        System.out.println("Absis: " + t1.getAbsis());
        System.out.println("Ordinat: " + t1.getOrdinat());
    }
}
/* Nama File    : mainBangunDatar.java
 * Deskripsi    : Program utama untuk menjalankan class bangunDatar, Persegi, dan Lingkaran
 * Pembuat      : Olivia Oktaviani (24060124120050)
 * Tanggal      : 11 Maret 2026
 */

package Pertemuan4;

public class MainBangunDatar {
    public static void main(String[] args){

        Persegi p1=new Persegi(5, "Merah", "Hitam");
        Lingkaran l1=new Lingkaran(7, "Biru", "Putih");

        System.out.println("INFO PERSEGI");
        p1.printInfo();
        System.out.println();
        System.out.println("INFO LINGKARAN");
        l1.printInfo();
        System.out.println();

        bangunDatar bd=new bangunDatar();
        bd.PrintCount();
    }
}

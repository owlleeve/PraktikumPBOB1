/* Nama File    : MainBangunDatar.java
 * Deskripsi    : Program utama untuk membuat objek Persegi dan Lingkaran
 * Pembuat      : Olivia Oktaviani (24060124120050)
 * Tanggal      : 22 Maret 2026
 */
package Pertemuan5;

public class MainBangunDatar {
    public static void main(String[] args){

        BangunDatar P1 = new Persegi(10, "Merah", "Hitam");
        Persegi P2 = new Persegi(5, "Hijau", "Putih");
        BangunDatar L1 = new Lingkaran(7, "Biru", "Putih");
        Lingkaran L2 = new Lingkaran(14, "Kuning", "Hitam");
        
        System.out.println("PERSEGI P1");
        P1.printInfo();
        System.out.println("\nPERSEGI P2");
        P2.printInfo();
        System.out.println("\nLINGKARAN L1");
        L1.printInfo();
        System.out.println("\nLINGKARAN L2");
        L2.printInfo();
        System.out.println();

        //perbandingan
        System.out.println("PERBANDINGAN");
        System.out.println("P1 vs P2 (Luas)     : " + P1.isEqualLuas(P2));
        System.out.println("P1 vs L1 (Luas)     : " + P1.isEqualLuas(L1));

        System.out.println("P1 vs P2 (Keliling) : " + P1.isEqualKeliling(P2));
        System.out.println("P1 vs L1 (Keliling) : " + P1.isEqualKeliling(L1));

        //resize
        System.out.println("\nRESIZE");

        //tampilkan sebelum resize
        System.out.println("SEBELUM RESIZE");
        System.out.println("Persegi P2");
        P2.printInfo();
        System.out.println();
        System.out.println("Lingkaran L2");
        L2.printInfo();

        //proses resiez
        P2.zoomIn();
        L2.zoomOut();

        System.out.println("\nSETELAH RESIZE");
        P2.printInfo();
        System.out.println();
        L2.printInfo();

        //counter
        System.out.println();
        BangunDatar.PrintCount();

    }
}

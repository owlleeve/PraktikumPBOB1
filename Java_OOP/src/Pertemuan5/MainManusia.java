/* Nama File    : MManusia.java
 * Deskripsi    : Program utama untuk menjalankan objek Manusia
 * Pembuat      : Olivia Oktaviani (24060124120050)
 * Tanggal      : 24 Maret 2026
 */
package Pertemuan5;

public class MainManusia {
    public static void main(String[] args){

        //buat objek
        PNS p1 = new PNS("Satriyo", "2006-04-01", "Jl. Seroja", 15000000, "198302032006041002");
        Pengusaha pe1 = new Pengusaha("Adhy", "Jl.Air", "2000-01-01", 55000000, "000-556-773-212-000-5");
        Petani pt1 = new Petani("Nugraha", "Jl. Bunga 9 Tembalang", "1977-01-09", 5000000, "Wonogiri");

        PNS p2 = new PNS("Panji", "2010-04-01", 10000000, "198004212010041002");
        p2.setAlamat("Jl. Panorama 111 Tembalang");

        //menampilkan jumlah objek
        System.out.println("==== DATA JUMLAH ====");
        System.out.println("Jumlah Manusia     : " + Manusia.getCounterMns());
        System.out.println("Jumlah PNS         : " + PNS.getCounterPNS());
        System.out.println("Jumlah Pengusaha   : " + Pengusaha.getCounterPengusaha());
        System.out.println("Jumlah Petani      : " + Petani.getCounterPetani());

        //menampilkan pajak
        System.out.println("\n==== PAJAK ====");
        System.out.printf("Pajak PNS p1        : Rp %,.0f\n", p1.hitungPajak());
        System.out.printf("Pajak Pengusaha     : Rp %,.0f\n", pe1.hitungPajak());
        System.out.printf("Pajak Petani        : Rp %,.0f\n", pt1.hitungPajak());

        //menampilkan masa kerja
        System.out.println("\n==== MASA KERJA ====");
        System.out.println("PNS                : " + p1.hitungMasaKerja() + " tahun");
        System.out.println("Pengusaha          : " + pe1.hitungMasaKerja() + " tahun");
        System.out.println("Petani             : " + pt1.hitungMasaKerja() + " tahun");

        //menampilkan data objek
        System.out.println("\n==== DATA OBJEK ====");
        System.out.println("PNS");
        p1.cetakInfo();

        System.out.println("\nPENGUSAHA");
        pe1.cetakInfo();

        System.out.println("\nPETANI");
        pt1.cetakInfo();
    }
}
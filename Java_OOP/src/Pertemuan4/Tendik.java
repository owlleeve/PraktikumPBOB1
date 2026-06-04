/* Nama File    : Tendik.java
 * Deskripsi    : Kelas turunan dari Pegawai untuk tenaga kependidikan
 * Pembuat      : Olivia Oktaviani (24060124120050)
 * Tanggal      : 15 Maret 2026
 */

package Pertemuan4;

import java.time.LocalDate;
import java.time.Period;

public class Tendik extends Pegawai{
    // ATRIBUT
    private String bidang;
    private final int bup=55;

    // METHOD
    //konstruktor dengan parameter
    public Tendik(String nip, String nama, String tanggalLahir, String tmt, double gajiPokok, String bidang){
        super(nip,nama,tanggalLahir,tmt,gajiPokok);
        this.bidang=bidang;
    }

    //tunjangan dari masa kerja
    public double hitungTunjangan(LocalDate now){
        int tahun =getMasaKerja(now).getYears();
        return 0.01*tahun*gajiPokok;
    }
    
    //menampilkan printInfo tendik
    public void printInfo(LocalDate now){
        Period mk = getMasaKerja(now);

        System.out.println("NIP             : " + nip);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + tanggalLahir.format(format));
        System.out.println("TMT             : " + tmt.format(format));
        System.out.println("Jabatan         : Tenaga Kependidikan");
        System.out.println("Bidang          : " + bidang);

        System.out.println("Masa Kerja      : " + mk.getYears() + " tahun " + mk.getMonths() + " bulan");
        System.out.println("Tanggal Pensiun : " + pensiun(bup).format(format));
        System.out.println("Gaji Pokok      : Rp " + String.format("%,.2f", gajiPokok));
        System.out.println("Tunjangan       : 1% x 7 x Rp 3.500.000,00 = Rp " + String.format("%,.2f", hitungTunjangan(now)));
    }
}
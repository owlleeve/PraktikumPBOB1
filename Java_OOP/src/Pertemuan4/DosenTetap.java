/* Nama File    : DosenTetap.java
 * Deskripsi    : Kelas turunan dari Dosen untuk dosen tetap
 * Pembuat      : Olivia Oktaviani (24060124120050)
 * Tanggal      : 15 Maret 2026
 */

package Pertemuan4;

import java.time.LocalDate;
import java.time.Period;

public class DosenTetap extends Dosen{
    // ATRIBUT
    private String nidn;
    private final int bup = 65;

    // METHOD
    //konstruktor dengan parameter
    public DosenTetap(String nip, String nidn, String nama, String tanggalLahir, String tmt, double gajiPokok, String fakultas){
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidn=nidn;
    }

    //hitung tunjangan dari masakerja
    public double tunjangan(LocalDate now){
        int th = getMasaKerja(now).getYears();
        return 0.02 *th * gajiPokok;
    }

    //menampilkan printInfo dosen tetap
    public void printInfo(LocalDate now){
        Period mk=getMasaKerja(now);

        System.out.println("NIP             : " + nip);
        System.out.println("NIDN            : " + nidn);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + tanggalLahir.format(format));
        System.out.println("TMT             : " + tmt.format(format));
        System.out.println("Jabatan         : Dosen Tetap");
        System.out.println("Fakultas        : " + fakultas);

        System.out.println("Masa Kerja      : " + mk.getYears() + " tahun " + mk.getMonths() + " bulan");
        System.out.println("Tanggal Pensiun : " + pensiun(bup).format(format));
        System.out.println("Gaji Pokok      : Rp " + String.format("%,.2f", gajiPokok));
        System.out.println("Tunjangan       : 2% x 10 x Rp 5.000.000,00 = Rp " + String.format("%,.2f", tunjangan(now)));
    }
}

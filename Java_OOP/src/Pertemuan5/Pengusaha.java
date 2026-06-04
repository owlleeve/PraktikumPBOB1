/* Nama File    : Pengusaha.java
 * Deskripsi    : Kelas turunan dari Manusia untuk Pengusaha
 * Pembuat      : Olivia Oktaviani (24060124120050)
 * Tanggal      : 24 Maret 2026
 */
package Pertemuan5;

import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia implements Pajak{
    // ATRBUT
    private String npwp;
    private static int counterPengusaha = 0;
    private final int B = 5;

    //METHOD
    //kosntruktor dengan parameter
    public Pengusaha(String nama, String alamat, String tgl_mulai, double pendapatan, String npwp) {
        super(nama, alamat, tgl_mulai, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    //getter jumlahpengusaha
    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    //hitung masa kerja pengusaha
    @Override
    public int hitungMasaKerja() {
        return Period.between(tgl_mulai, LocalDate.now()).getYears() + B;
    }

    //hitung pajak pengusaha
    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }

    //cetak info pengusaha
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP           : " + npwp);
    }
}

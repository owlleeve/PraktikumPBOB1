/* Nama File    : Petani.java
 * Deskripsi    : Kelas turunan dari Manusia untuk Petani
 * Pembuat      : Olivia Oktaviani (24060124120050)
 * Tanggal      : 24 Maret 2026
 */

package Pertemuan5;

import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements Pajak{
    // ATRIBUT
    private String asalKota;
    private static int counterPetani = 0;
    private final int C = 0;

    //konstruktor dengan parameter
    public Petani(String nama, String alamat, String tgl_mulai, double pendapatan, String asalKota) {
        super(nama, alamat, tgl_mulai, pendapatan);
        this.asalKota = asalKota;
        counterPetani++;
    }

    //getter jumlah petani
    public static int getCounterPetani() {
        return counterPetani;
    }

    //hitung masa kerja petani
    @Override
    public int hitungMasaKerja() {
        return Period.between(tgl_mulai, LocalDate.now()).getYears() + C;
    }

    //hitung pajak petani

    @Override
    public double hitungPajak() {
        return 0;
    }

    //cetak info petani
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota      : " + asalKota);
    }
}

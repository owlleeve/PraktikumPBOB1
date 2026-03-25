/* Nama File    : PNS.java
 * Deskripsi    : Kelas turunan dari Manusia untuk PNS
 * Pembuat      : Olivia Oktaviani (24060124120050)
 * Tanggal      : 24 Maret 2026
 */

package Pertemuan5;

import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia implements Pajak{
    // ATRIBUT
    private String nip;
    private static int counterPNS = 0;
    private final int A = 0; // digit ke-14 NIM

    // METHOD
    //konstruktor tanpa parameter
    public PNS() {
        super();
        counterPNS++;
    }

    //konstruktor dengan parameter
    public PNS(String nama, String tgl_mulai, double pendapatan, String nip){
        this(nama, tgl_mulai, "-", pendapatan, nip);
    }

    //konstruktor lengkap
    public PNS(String nama, String tgl_mulai, String alamat, double pendapatan, String nip) {
        super(nama, alamat, tgl_mulai, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    //getter jumlah pns
    public static int getCounterPNS() {
        return counterPNS;
    }

    //hitung masa kerja pns
    @Override
    public int hitungMasaKerja() {
        return Period.between(tgl_mulai, LocalDate.now()).getYears() + A;
    }

    //hitung pajak pns
    @Override
    public double hitungPajak() {
        return 0.1 * pendapatan;
    }

    //cetak info pns
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP            : " + nip);
    }
}

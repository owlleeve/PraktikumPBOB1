/* Nama File    : DosenTamu.java
 * Deskripsi    : Kelas turunan dari Dosen untuk dosen tamu
 * Pembuat      : Olivia Oktaviani (24060124120050)
 * Tanggal      : 15 Maret 2026
 */

package Pertemuan4;

import java.time.LocalDate;
import java.time.Period;

public class DosenTamu extends Dosen{
    // ATRIBUT
    private String nidk;
    private LocalDate akhirKontrak;

    // METHOD
    //konstruktor dengan parameter
    public DosenTamu(String nip, String nidk, String nama, String tanggalLahir, String tmt, double gajiPokok, String fakultas, String akhirKontrak){
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.akhirKontrak = LocalDate.parse(akhirKontrak, format);
    }

    //hitung sisa kontrak
    public int sisaBulan(LocalDate now){
        if (now.isAfter(akhirKontrak)) return 0;

        Period p = Period.between(now, akhirKontrak);
        return p.getYears()*12 + p.getMonths();
    }

    //tunjangan tetap
    public double tunjangan(){
        return 0.025 * gajiPokok;
    }

    //menampilkan printInfo dosen tamu
    public void printInfo(LocalDate now){
        System.out.println("NIP             : " + nip);
        System.out.println("NIDK            : " + nidk);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + tanggalLahir.format(format));
        System.out.println("TMT             : " + tmt.format(format));
        System.out.println("Jabatan         : Dosen Tamu");
        System.out.println("Fakultas        : " + fakultas);

        System.out.println("Sisa Kontrak    : " + sisaBulan(now) + " bulan");
        System.out.println("Tanggal Berakhir: " + akhirKontrak.format(format));
        System.out.println("Gaji Pokok      : Rp " + String.format("%,.2f", gajiPokok));
        System.out.println("Tunjangan       : 2,5% x Rp 4.000.000,00 = Rp " + String.format("%,.2f", tunjangan()));
    } 
}
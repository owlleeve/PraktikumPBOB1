/* Nama File    : Pegawai.java
 * Deskripsi    : Superclass untuk data dan perhitungan pegawai
 * Pembuat      : Olivia Oktaviani (24060124120050)
 * Tanggal      : 15 Maret 2026
 */

package Pertemuan4;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Pegawai {
    // ATRIBUT
    protected String nip;
    protected String nama;
    protected LocalDate tanggalLahir;
    protected LocalDate tmt;
    protected double gajiPokok;

    //formatter tanggal di Indonesia
    protected DateTimeFormatter format = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));

    // METHOD
    //konstruktor tanpa parameter
    public Pegawai(){
    }

    //konstruktor dengan parameter
    public Pegawai(String nip, String nama, String tanggalLahir, String tmt, double gajiPokok){
        this.nip=nip;
        this.nama=nama;
        this.tanggalLahir=LocalDate.parse(tanggalLahir, format);
        this.tmt=LocalDate.parse(tmt, format);
        this.gajiPokok=gajiPokok;
    }
    
    //hitung masa kerja
    public Period getMasaKerja(LocalDate now){
    return Period.between(tmt, now);
    }

    //hitung tanggal persiun
    public LocalDate pensiun(int bup){
        return tanggalLahir.plusYears(bup)
                       .withDayOfMonth(1)
                       .plusMonths(1);
    }
}
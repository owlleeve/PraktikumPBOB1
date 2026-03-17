/* Nama File    : MainPegawai.java
 * Deskripsi    : Kelas utama untuk menjalankan semua turunan pegawai
 * Pembuat      : Olivia Oktaviani (24060124120050)
 * Tanggal      : 15 Maret 2026
 */

package Pertemuan4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class MainPegawai {
    public static void main(String[] args){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        LocalDate now = LocalDate.parse("10 Maret 2025", format);

        // DOSEN TETAP
        System.out.println("DOSEN TETAP");
        DosenTetap dt = new DosenTetap("9545647548", "78647324", "Andi", "5 Mei 1990", "1 Januari 2015", 5000000, "Fakultas Sains dan Matematika");
        dt.printInfo(now);
        System.out.println();

        //  DOSEN TAMU
        System.out.println("DOSEN TAMU");
        DosenTamu dT = new DosenTamu("9545647500", "11223344", "Budi", "15 Maret 1985", "1 Juni 2022", 4000000, "Fakultas Teknik", "31 Desember 2026");
        dT.printInfo(now);
        System.out.println();

        // TENDIK
        System.out.println("TENDIK");
        Tendik t = new Tendik("9545647612", "Sari", "20 Agustus 1992", "1 Maret 2018", 3500000, "Akademik");
        t.printInfo(now);
    }
}
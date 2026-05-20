/* Nama File    : Dosen.java
 * Deskripsi    : Kelas turunan dari Pegawai dengan atribut fakultas
 * Pembuat      : Olivia Oktaviani (24060124120050)
 * Tanggal      : 15 Maret 2026
 */

package Pertemuan4;

public class Dosen extends Pegawai{
    // ATRIBUT
    protected String fakultas;

    // METHOD
    //konstruktor dengan parameter
    public Dosen(String nip, String nama, String tanggalLahir, String tmt, double gajiPokok, String fakultas){
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }
}

/* Nama File: Kendaraan.java
 * Deskripsi: class yang menyimpan data kendaraan mahasiswa
 * Pembuat: Olivia Oktaviani (24060124120050)
 * Tanggal: 8 Maret 2026
 */

package Pertemuan3;

public class Kendaraan {
    // ATRIBUT
    private String nomorPlat;
    private String jenis;

    // METHOD
    //konstruktor tanpa parameter
    public Kendaraan(){
        this.nomorPlat= "";
        this.jenis= "";
    }

    //konstruktor dengan parameter
    public Kendaraan(String nomorPlat, String jenis){
        this.nomorPlat = nomorPlat;
        this.jenis = jenis;
    }

    //getter
    public String getNomorKendaraan(){
        return nomorPlat;
    }

    public String getJenisKendaraan(){
        return jenis;
    }

    //setter
    public void setNomorKendaraan(String nomorPlat){
        this.nomorPlat = nomorPlat;
    }

    public void setJenisKendaraan(String jenis){
        this.jenis = jenis;
    }
}
/* Nama File: Dosen.java
 * Deskripsi: class yang menyimpan informasi dosen
 * Pembuat: Olivia Oktaviani (24060124120050)
 * Tanggal: 8 Maret 2026
 */

package Pertemuan3;

public class Dosen {
    // ATRIBUT
    private String nip;
    private String nama;
    private String prodi;

    // METHOD
    // konstruktor tanpa parameter
    public Dosen(){
        this.nip = "" ;
        this.nama = "" ;
        this.prodi = "" ;
    }

    // konstruktor dengan parameter
    public Dosen(String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    //getter
    public String getNIP(){
        return nip;
    }

    public String getNama(){
        return nama;
    }

    public String getProdi(){
        return prodi;
    }

    //setter
    public void setNIP(String nip){
        this.nip = nip;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }
}
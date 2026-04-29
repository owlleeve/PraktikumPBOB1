/* Nama File    : Dosen.java
 * Deskripsi    : Kelas Dosen turunan Civitasakademika
 * Pembuat      : Olivia Oktaviani (24060124120050)
 * Tanggal      : 28 April 2026
 */
package PBO07_24060124120050;

public class Dosen extends CivitasAkademika {
    // ATRIBUT
    private String nip;

    // METHOD
    //konstruktor dengan parameter
    public Dosen(String nama, String nip){
        super(nama);
        this.nip = nip;
    }

    // getter nip
    public String getNip(){ 
        return nip; 
    }

    //ambil nomor nip
    @Override
    public String getNomor(){ 
        return nip; 
    }
}
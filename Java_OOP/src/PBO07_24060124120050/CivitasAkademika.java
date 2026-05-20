/* Nama File    : CivitasAkademika.java
 * Deskripsi    : Superclass civitas akademika
 * Pembuat      : Olivia Oktaviani (24060124120050)
 * Tanggal      : 28 April 2026
 */
package PBO07_24060124120050;

public abstract class CivitasAkademika {
    // ATRIBUT
    protected String nama;

    // METHOD
    //konstruktor
    public CivitasAkademika(String nama){
        this.nama = nama;
    }

    //getter nama
    public String getNama(){
        return nama; 
    }

    //ambil no identitas (abstract)
    public abstract String getNomor();
}
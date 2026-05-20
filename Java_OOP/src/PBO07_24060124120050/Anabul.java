/* Nama File    : Anabul.java
 * Deskripsi    : Superclass hewan peliharaan
 * Pembuat      : Olivia Oktaviani (24060124120050)
 * Tanggal      : 27 April 2026
 */
package PBO07_24060124120050;

public abstract class Anabul {
    // ATRIBUT
    protected String nama;

    // METHOD
    //konstruktor dengan parameter
    public Anabul(String nama){
        this.nama = nama;
    }

    //getter nama
    public String getNama(){ 
        return nama; 
    }

    //menentukan cara hewan bergerak (abstract)
    public abstract void gerak();

    //menentukan suara hewan (abstract)
    public abstract void bersuara();
}
/* Nama File    : Anabul.java
 * Deskripsi    : Superclass hewan peliharaan
 * Pembuat      : Olivia Oktaviani (24060124120050)
 * Tanggal      : 3 Mei 2026
 */
package PBO08_24060124120050;

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

    //setter nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    //menentukan cara hewan bergerak (abstract)
    public abstract void gerak();

    //menentukan suara hewan (abstract)
    public abstract void bersuara();
}
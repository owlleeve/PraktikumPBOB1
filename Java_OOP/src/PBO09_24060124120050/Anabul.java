/* Nama File    : Anabul.java
 * Deskripsi    : Kelas abstrak dasar hewan peliharaan
 * Pembuat      : Olivia Oktaviani (24060124120050)
 * Tanggal      : 11 Mei 2026
 */

package PBO09_24060124120050;

public abstract class Anabul {
    // ATRIBUT
    protected String nama;
    protected double berat;
    protected String panggilan;

    // METHOD
    //konstruktor dengan parameter
    public Anabul(String nama, double berat){
        this.nama = nama;
        this.berat = berat;
        this.panggilan = nama;
    }

    //getter nama
    public String getNama(){ 
        return nama; 
    }

    //setter nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // getter berat
    public double getBerat() {
        return berat;
    }

    //menentukan cara hewan bergerak (abstract)
    public abstract void gerak();

    //menentukan suara hewan (abstract)
    public abstract void bersuara();
}
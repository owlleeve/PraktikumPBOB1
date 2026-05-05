/* Nama File    : Datum.java
 * Deskripsi    : 
 * Pembuat      : Olivia Oktaviani (24060124120050)
 * Tanggal      : 3 Mei 2026
 */

package PBO08_24060124120050;

public class Datum<T> {
    // ATRIBUT
    protected T isi;

    // METHOD
    //getter getIsi
    public T getIsi(){
        return this.isi;
    }

    //setter setIsi
    public void setIsi(T isibaru){
        this.isi=isibaru;
    }
    
}

/* Nama File    : KembangTelon.java
 * Deskripsi    : Subclass dari Kucing
 * Pembuat      : Olivia Oktaviani (24060124120050)
 * Tanggal      : 3 Mei 2026
 */

package PBO08_24060124120050;

public class KembangTelon extends Kucing{
    // ATRIBUT

    // METHOD
    //konstruktor dgn parameter
    public KembangTelon (String nama, double bobot){
        super(nama,bobot);
    }

    //berat dlm kg
    public String toString() {
        return "KembangTelon: " + this.getNama() + " (" + this.getBobot() + " kg)";
    }
} 

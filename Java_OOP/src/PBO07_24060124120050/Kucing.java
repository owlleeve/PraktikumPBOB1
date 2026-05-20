/* Nama File    : Kucing.java
 * Deskripsi    : Kelas anak Kucing
 * Pembuat      : Olivia Oktaviani (24060124120050)
 * Tanggal      : 27 April 2026
 */
package PBO07_24060124120050;

public class Kucing extends Anabul {
    // ATRIBUT 

    // METHOD
    //konstruktor dengan parameter
    public Kucing(String nama){
        super(nama);
    }

    //cara bergerak kucing
    @Override
    public void gerak(){
        System.out.println(nama + " bergerak dengan melata.");
    }

    //suara kucing
    @Override
    public void bersuara(){
        System.out.println(nama + " berbunyi meong!");
    }
}
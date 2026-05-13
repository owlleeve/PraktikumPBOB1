/* Nama File    : Kucing.java
 * Deskripsi    : Kelas anak Kucing
 * Pembuat      : Olivia Oktaviani (24060124120050)
 * Tanggal      : 11 Mei 2026
 */
package PBO09_24060124120050;

public class Kucing extends Anabul {
    // ATRIBUT 
    protected double bobot;

    // METHOD
    //konstruktor dengan parameter
    public Kucing(String nama, double berat){
        super(nama, berat);
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
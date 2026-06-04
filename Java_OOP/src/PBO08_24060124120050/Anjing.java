/* Nama File    : Anjing.java
 * Deskripsi    : Kelas anak Anjing
 * Pembuat      : Olivia Oktaviani (24060124120050)
 * Tanggal      : 3 Mei 2026
 */
package PBO08_24060124120050;

public class Anjing extends Anabul {
    // ATRIBUT 

    // METHOD
    //konstruktor dengan parameter
    public Anjing(String nama){
        super(nama);
    }

    //cara bergerak anjing
    @Override
    public void gerak(){
        System.out.println(nama + " bergerak dengan melata.");
    }

    //suara anjing
    @Override
    public void bersuara(){
        System.out.println(nama + " bersuara guk-guk!");
    }
}
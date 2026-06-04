/* Nama File    : Burung.java
 * Deskripsi    : Kelas anak Burung
 * Pembuat      : Olivia Oktaviani (24060124120050)
 * Tanggal      : 11 Mei 2026
 */
package PBO09_24060124120050;

public class Burung extends Anabul {
    // ATRIBUT 

    //METHOD
    //konstruktor dengan parameter
    public Burung(String nama, double berat){
        super(nama, berat);
    }

    //cara bergerak burung
    @Override
    public void gerak(){
        System.out.println(nama + " bergerak dengan terbang.");
    }

    //suara burung
    @Override
    public void bersuara(){
        System.out.println(nama + " berbunyi cuit!");
    }
}

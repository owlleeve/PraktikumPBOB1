/* Nama File    : Kucing.java
 * Deskripsi    : Kelas anak Kucing
 * Pembuat      : Olivia Oktaviani (24060124120050)
 * Tanggal      : 3 Mei 2026
 */
package PBO08_24060124120050;

public class Kucing extends Anabul {
    // ATRIBUT 
    protected double bobot;

    // METHOD
    //konstruktor dengan parameter
    public Kucing(String nama, double bobot){
        super(nama);
        this.bobot=bobot;
    }

    //getter bobot
    public double getBobot(){
        return bobot;
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
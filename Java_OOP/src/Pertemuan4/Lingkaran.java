/* Nama File    : Lingkaran.java
 * Deskripsi    : Kelas turunan dari bangunDatar yang merepresentasikan bangun datar lingkaran
 * Pembuat      : Olivia Oktaviani (24060124120050)
 * Tanggal      : 11 Maret 2026
 */

package Pertemuan4;

public class Lingkaran extends bangunDatar{
    // ATRIBUT
    private double jariJari;

    // METHOD
    //konstruktor tanpa parameter
    public Lingkaran(){
    }

    //konstruktor dengan parameter
    public Lingkaran(double jariJari, String warna, String border){
        this.jariJari=jariJari;
        setWarna(warna);
        setBorder(border);
    }

    // getter dan setter jari-jari
    public double getJariJari(){
        return jariJari;
    }

    public void setJariJari(double jariJari){
        this.jariJari=jariJari;
    }

    //luas dan keliling lingkaran
    public double getLuasLingkaran(){
        return Math.PI * jariJari *jariJari;
    }

    public double getKelilingLingkaran(){
        return Math.PI * 2 *jariJari;
    }

    //print info
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("jariJari Lingkaran: " + getJariJari());
        System.out.println("Luas Lingkaran: " + getLuasLingkaran());
        System.out.println("Keliling Lingkaran: " + getKelilingLingkaran());

    }
}

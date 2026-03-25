/* Nama File    : Lingkaran.java
 * Deskripsi    : Kelas turunan dari BangunDatar untuk Lingkaran
 * Pembuat      : Olivia Oktaviani (24060124120050)
 * Tanggal      : 22 Maret 2026
 */
package Pertemuan5;

public class Lingkaran extends BangunDatar implements IResize{
    // ATRIBUT
    private double jariJari;

    // METHOD
    //konstruktor tanpa parameter
    public Lingkaran(){
        super();
        this.jmlSisi=0;
    }

    //konstruktor dengan parameter
    public Lingkaran(double jariJari, String warna, String border){
        super(warna, border);
        this.jmlSisi=0;
        this.jariJari=jariJari;
    }

    // getter dan setter jari-jari
    public double getJariJari(){
        return jariJari;
    }

    public void setJariJari(double jariJari){
        this.jariJari=jariJari;
    }

    //override pd luas dan keliling lingkaran
    @Override
    public double getLuas(){
        return Math.PI * jariJari *jariJari;
    }

    @Override 
    public double getKeliling(){
        return Math.PI * 2 *jariJari;
    }

    //implement interface
     @Override
    public void zoomIn() {
        jariJari *= 1.1;
    }

    @Override
    public void zoomOut() {
        jariJari *= 0.9;
    }

    @Override
    public void zoom(double percent) {
        jariJari *= percent;
    } 

    //print info lingkaran
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("jariJari Lingkaran  : " + getJariJari());
        System.out.println("Luas Lingkaran      : " + getLuas());
        System.out.println("Keliling Lingkaran  : " + getKeliling());

    }
}

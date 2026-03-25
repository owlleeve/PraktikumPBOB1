/* Nama File    : Persegi.java
 * Deskripsi    : Kelas turunan dari BangunDatar untuk Persegi
 * Pembuat      : Olivia Oktaviani (24060124120050)
 * Tanggal      : 22 Maret 2026
 */

package Pertemuan5;

public class Persegi extends BangunDatar implements IResize{
    // ATRIBUT
    private double sisi;

    // METHOD
    //konstruktor tanpa parameter
    public Persegi(){
        super();
        this.jmlSisi=4;
    }
    
    //konstruktor dengan parameter
    public Persegi(double sisi, String warna, String border){
        super(4, warna, border);
        this.sisi=sisi;
    }

    //getter dan setter sisi
    public double getSisi(){
        return sisi;
    }

    public void setSisi(double sisi){
        this.sisi=sisi;
    }

    //override abstract pd luas dan keliling persegi
    @Override
    public double getLuas(){
        return sisi * sisi;
    }

    @Override
    public double getKeliling(){
        return 4 * sisi;
    }

    //implement interface
     @Override
    public void zoomIn() {
        sisi *= 1.1;
    }

    @Override
    public void zoomOut() {
        sisi *= 0.9;
    }

    @Override
    public void zoom(double percent) {
        sisi *= percent;
    }

    //printinfo persegi
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Sisi Persegi        : " + sisi);
        System.out.println("Luas Persegi        : " + getLuas());
        System.out.println("Keliling Persegi    : " + getKeliling());
    }
}

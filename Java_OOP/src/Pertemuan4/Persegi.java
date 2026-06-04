/* Nama File    : Persegi.java
 * Deskripsi    : Kelas turunan dari bangunDatar yang merepresentasikan bangun datar persegi
 * Pembuat      : Olivia Oktaviani (24060124120050)
 * Tanggal      : 11 Maret 2026
 */

package Pertemuan4;

public class Persegi extends bangunDatar {
    // ATRIBUT
    private double sisi;

    // METHOD
    //konstruktor tanpa parameter
    public Persegi(){
        setjmlSisi(4);
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

    //luas dan keliling persegi
    public double getLuasPersegi(){
        return sisi * sisi;
    }

    public double getKelilingPersegi(){
        return 4 * sisi;
    }

    //override
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Sisi Persegi: " + sisi);
        System.out.println("Luas Persegi: " + getLuasPersegi());
        System.out.println("Keliling Persegi: " + getKelilingPersegi());
    }
}

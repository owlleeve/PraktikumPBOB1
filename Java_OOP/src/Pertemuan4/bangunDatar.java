/* Nama File    : bangunDatar.java
 * Deskripsi    : Program utama yang digunakan untuk membuat objek Persegi dan Lingkaran
 * Pembuat      : Olivia Oktaviani (24060124120050)
 * Tanggal      : 11 Maret 2026
 */

package Pertemuan4;

public class bangunDatar {
    // ATRIBUT
    private int jmlSisi;
    private String warna;
    private String border;
    private static int counterBangunDatar=0;

    // METHOD
    // konstruktor tanpa parameter
    public bangunDatar(){
        counterBangunDatar++;
    }

    // konstruktor dengan parameter
    public bangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi= jmlSisi;
        this.warna =warna;
        this.border=border;
        counterBangunDatar++;
    }

    // getter dan setter jumlah sisi
    public int getjmlSisi(){
        return jmlSisi;
    }

    public void setjmlSisi(int jmlSisi){
        this.jmlSisi=jmlSisi;
    }

    // getter dan setter warna
    public String getWarna(){
        return warna;
    }

    public void setWarna(String warna){
        this.warna=warna;
    }

    // getter dan setter border
    public String getBorder(){
        return border;
    }

    public void setBorder(String border){
        this.border=border;
    }
    
    //print info
    public void printInfo(){
        System.out.println("Jumlah Sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }

    public void PrintCount(){
        System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    }
}

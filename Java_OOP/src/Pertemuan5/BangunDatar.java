/* Nama File    : BangunDatar.java
 * Deskripsi    : Superclass abstract untuk bangun datar
 * Pembuat      : Olivia Oktaviani (24060124120050)
 * Tanggal      : 22 Maret 2026
 */
package Pertemuan5;

import Pertemuan5.BangunDatar;

public abstract class BangunDatar {
    // ATRIBUT
    protected int jmlSisi;
    protected String warna;
    protected String border;
    protected static int counterBangunDatar = 0;

    // METHOD
    // konstruktor tanpa parameter
    public BangunDatar(){
        counterBangunDatar++;
    }

    // konstruktor dengan parameter
    public BangunDatar(String warna, String border){
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    //konstruktor lengkap
    public BangunDatar(int jmlSisi, String warna, String border){
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
    
    // abstract method luas
    public abstract double getLuas();

    // abstract method keliling
    public abstract double getKeliling();

    // membandingkan luas dua objek
    public boolean isEqualLuas(BangunDatar X) {
        return Math.abs(this.getLuas() - X.getLuas()) < 0.0001;
    }

    // membandingkan keliling dua objek
    public boolean isEqualKeliling(BangunDatar X) {
        return Math.abs(this.getKeliling() - X.getKeliling()) < 0.0001;
    }

    //print info bangun datar
    public void printInfo(){
        System.out.println("Jumlah Sisi         : " + jmlSisi);
        System.out.println("Warna               : " + warna);
        System.out.println("Border              : " + border);
    }

    public static void PrintCount(){
        System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    }
}

/* Nama File: Garis.java
 * Deskripsi: berisi atribut dan method dalam class Garis
 * Pembuat: Olivia Oktaviani
 * Tanggal: 3 Maret 2026
 */

package Pertemuan2;

public class Garis {
    // ATRIBUT
    Titik a; //awal
    Titik b; //akhir
    static int counterGaris;

    //METHOD
    //konstruktor kosong
    public Garis(){
        this.a = new Titik();
        this.a.setAbsis(0);
        this.a.setOrdinat(0);

        this.b = new Titik();
        this.b.setAbsis(1);
        this.b.setOrdinat(1);

        counterGaris++;
    }

    //kontruktor dgn parameter
    public Garis(Titik a, Titik b){
        this.a = a;
        this.b = b;

        counterGaris++;
    }

    // getter
    public Titik getA(){
        return a;
    }

    public Titik getB(){
        return b;
    }

    public static int getCounterGaris(){
        return counterGaris;
    }

    //setter
    public void setA(Titik aTitik){
        this.a = aTitik;
    }

    public void setB(Titik bTitik){
        this.b = bTitik;
    }

    //panjang grais
    public double getPanjang(){
        double dx = b.getAbsis() - a.getAbsis();
        double dy = b.getOrdinat() - a.getOrdinat();
        return Math.sqrt(dx*dx + dy*dy);
    }

    //gradien
    public double getGradien(){
        double dx = b.getAbsis() - a.getAbsis();
        double dy = b.getOrdinat() - a.getOrdinat();
        return dy/dx;
    }

    //titik tengah
    public Titik getTitikTengah(){
        int xTengah = (a.getAbsis() + b.getAbsis()) /2;
        int yTengah = (a.getOrdinat() + b.getOrdinat()) /2;
        return new Titik(xTengah, yTengah);
    }

    //cek sejajar
    public boolean isSejajar(Garis g){
        return this.getGradien() == g.getGradien();
    }

    //cek tegak lurus
    public boolean isTegakLurus(Garis g){
        return this.getGradien()* g.getGradien() == -1;
    }

    //print
    public void printGaris() {
        System.out.println("Titik Awal: (" + a.getAbsis() + "," + a.getOrdinat() + ")");
        System.out.println("Titik Akhir: (" + b.getAbsis() + "," + b.getOrdinat() + ")");
    }

    //persamaan garis
    public String getPersamaan(){
        double m = getGradien();
        double c = a.getOrdinat() - (m* a.getAbsis());
        return "y = " + m + "x + " + c;
    }
}
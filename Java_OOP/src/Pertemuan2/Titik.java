/* Nama File: Titik.java
 * Deskripsi: berisi atribut dan method dalam class Titik
 * Pembuat: Olivia Oktaviani
 * Tanggal: 3 Maret 2026
 */

package Pertemuan2;
public class Titik {
    // ATRIBUT
    private int x; //absis
    private int y; //ordinat

    // METHOD
    //konstruktor kosong
    public Titik(){
        this.x = 0;
        this.y = 0;
    }

    //konstruktor dengan parameter
    public Titik(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //setter
    public void setAbsis(int newX){
        this.x = newX;
    }
    public void setOrdinat(int newY){
        this.y = newY;
    }

    //getter
    public int getAbsis(){
        return this.x;
    }
    public int getOrdinat(){
        return this.y;
    }

    //geser
    public void geser(int x, int y){
        this.x += x;
        this.y += y;
    }

    //cari kuadran
    public int getKuadran(){
        if (x>0 && y>0) {
            return 1;
        }else if (x<0 && y>0){
            return 2;
        }else if (x<0 && y<0){
            return 3;
        }else if (x>0 && y<0){
            return 4;
        }else{
            return 0;
        }
    }

    //jarak
    public double getJarakPusat(){
        return Math.sqrt(x*x + y*y);
    }
    public double getJarak(Titik T){
        double dx = this.x - T.x;
        double dy = this.y - T.y;
        return Math.sqrt(dx*dx + dy*dy);
    }

    //refleksi
    public void refleksiX(){
        x = x * (-1);
    }
    public void refleksiY(){
        y = y * (-1);
    }

    //getRefleksi
    public Titik getRefleksiX(){
        return new Titik(this.x, -this.y);
    }
    public Titik getRefleksiY() {
      return new Titik(-this.x, this.y);
   }
}

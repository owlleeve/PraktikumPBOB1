/* Nama File    : Data.java
 * Deskripsi    : 
 * Pembuat      : Olivia Oktaviani (24060124120050)
 * Tanggal      : 3 Mei 2026
 */

package PBO08_24060124120050;

public class Data<T> {
    // ATRIBUT
    protected T[] ruang;
    protected int banyak;

    // METHOD
    //kons tanpa parameter
    @SuppressWarnings("unchecked")
    public Data(){
        this.ruang=(T[]) new Object[100];
        this.banyak=0;
    }

    //getter getIsi dgn parameter
    public T getIsi(int posisi){
        if (posisi<1 || posisi>100) {
            throw new IllegalArgumentException("Parameter harus dalam rentang 1..100");
        }
        return ruang[posisi-1];
    }

    //setter setIsi
    public void setIsi(int posisi, T obj){
        if (posisi<1 || posisi>100){
            throw new IllegalArgumentException("Parameter harus daam rentang 1..100");
        }
        if (this.ruang[posisi - 1] == null) {
            this.banyak++;
        }
        this.ruang[posisi - 1] = obj;
    }

    //getter getSize
    public int getSize(){
        return this.banyak;
    }
    
}
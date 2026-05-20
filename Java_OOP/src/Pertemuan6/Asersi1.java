/* Nama File    : Asersi1.java
 * Deskripsi    : Program untuk menunjukan asersi
 * Pembuat      : Olivia Oktaviani (24060124120050)
 * Tanggal      : 24 Maret 2026
 */
package Pertemuan6;

public class Asersi1 {
    public static void main(String[] args){
        int x=0;
        if(x>0){
            System.out.println("bilangan positif");
        }else{
            assert(x>0): "ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}

/* Nama File    : MainAnabul.java
 * Deskripsi    : Aplikasi simulasi bunyi dan gerak anabul
 * Pembuat      : Olivia Oktaviani (24060124120050)
 * Tanggal      : 27 April 2026
 */
package PBO07_24060124120050;

public class MainAnabul {
    //main program
    public static void main(String[] args){
        //array hewan
        Anabul[] peliharaan = {
            new Kucing("Mochi"),
            new Anjing("Koko"),
            new Burung("Pipit")
        };

        //looping buat tampilin aksi tiap hewan
        for (Anabul a : peliharaan){
            System.out.println("--- " + a.getNama()+ " ---");
            a.gerak();
            a.bersuara();
        }
    }
}
/* Nama File    : AngkaSialException.java
 * Deskripsi    : Eksepsi buatan sendiri, menolak masukan angka 13!
 * Pembuat      : Olivia Oktaviani (24060124120050)
 * Tanggal      : 26 Maret 2026
 */
package Pertemuan6;

public class AngkaSialException extends Exception{
    public AngkaSialException(){
        super("jangan masukan angka 13 karena angka sial!");
    }
}

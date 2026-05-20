package Pertemuan1;
/* Nama File: Titik.java
 * Deskripsi: berisi atribut dan method dalam class Titik
 * Pembuat: Olivia Oktaviani
 * Tanggal: 24 Februari 2026
 */

public class mainTitik {
    public static void main(String[] args){
        titik T1 = new titik();     // membuat objek titik T1(0,0)
        T1.setAbsis(3);          // mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4);        // mengubah ordinat T1 dengan nilai 4
        T1.printTitik();           // mencetak koordinat T1 ke layar
        T1.geser(3,4);        // menggeser T1 sejauh (3,4)
        T1.printTitik();           // menampilkan koordinat T1 setelah digeser
    }
    
}
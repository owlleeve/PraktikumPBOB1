/* Nama File    : MainMahasiswa.java
 * Deskripsi    : Aplikasi uji kelas Mahasiswa
 * Pembuat      : Olivia Oktaviani (24060124120050)
 * Tanggal      : 26 April 2026
 */
package PBO07_24060124120050;

public class MainMahasiswa {
    public static void main(String[] args) {
        //c. konstruktor tanpa parameter
        Mahasiswa mhs1 = new Mahasiswa();
        System.out.println("Konstruktor Default");
        mhs1.cetakInfo();

        //d. konstruktor dgn parameter
        Mahasiswa mhs2 = new Mahasiswa(24060124120019L, "Nadia Azura", "Informatika");
        // (nim pakai int biasa saja karena tipe int)
        Mahasiswa mhs3 = new Mahasiswa(24060124120011L, "Khanza Qaila", "Sistem Informasi");
        System.out.println("\nKonstruktor Tiga Parameter");
        mhs2.cetakInfo();
        System.out.println("---");
        mhs3.cetakInfo();

        // konstruktor copy
        Mahasiswa mhs4 = new Mahasiswa(mhs2);
        System.out.println("\nKonstruktor Kloning dari mhs2");
        mhs4.cetakInfo();

        //uji overloading setProgramStudi
        System.out.println("\nVarian setProgramStudi");

        //varian 1: tanpa parameter
        mhs1.setProgramStudi();
        System.out.println("Varian 1 (tanpa param): " + mhs1.getProgramStudi());

        //varian 2: satu parameter string
        mhs1.setProgramStudi("Matematika");
        System.out.println("Varian 2 (string)     : " + mhs1.getProgramStudi());

        //varian 3: dari objek lain
        mhs1.setProgramStudi(mhs3);
        System.out.println("Varian 3 (dari mhs3)  : " + mhs1.getProgramStudi());
    }
}
/* Nama File: MMahasiswa.java
 * Deskripsi: class utama yang menjalankan program dan menguji objek dari class lainnya
 * Pembuat: Olivia Oktaviani (24060124120050)
 * Tanggal: 8 Maret 2026
 */

package Pertemuan3;

public class MMahasiswa {
    public static void main(String[] args) {

        // KAMUS
        MataKuliah mk1, mk2, mk3;
        Dosen dosen1;
        Kendaraan kendaraan1;
        Mahasiswa mhs1;

        // ALGORITMA
        // membuat objek Mata Kuliah, Dosen, Kendaraan, dan Mahasiswa
        mk1 = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        mk2 = new MataKuliah("MBD", "Manajemen Basis Data", 3);
        mk3 = new MataKuliah("ASA", "Analisis dan Strategi Algoritma", 3);
        dosen1 = new Dosen("12345", "Dr. Andi", "Informatika");
        kendaraan1 = new Kendaraan("H1234AB", "Motor");
        mhs1 = new Mahasiswa("24060124120050", "Olivia Oktaviani", "Informatika");

        // Mengatur dosen wali dan kendaraan mahasiswa
        mhs1.setDosenWali(dosen1);
        mhs1.setKendaraan(kendaraan1);

        // Menambahkan mata kuliah yang diambil mahasiswa
        mhs1.addMatkul(mk1);
        mhs1.addMatkul(mk2);
        mhs1.addMatkul(mk3);

        System.out.println("DATA MAHASISWA");
        mhs1.printDetailMhs();
        System.out.println("\nJumlah Mata Kuliah: " + mhs1.getJumlahMatkul());
        System.out.println("Total SKS: " + mhs1.getJumlahSKS());

        System.out.println("\nINFORMASI MATA KULIAH");
        System.out.println("Matkul 1: " + mk1.getNamaMatkul() + " (" + mk1.getSks() + " SKS)");
        System.out.println("Matkul 2: " + mk2.getNamaMatkul() + " (" + mk2.getSks() + " SKS)");
        System.out.println("Matkul 3: " + mk3.getNamaMatkul() + " (" + mk3.getSks() + " SKS)");
    }
}
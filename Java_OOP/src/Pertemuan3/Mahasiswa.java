/* Nama File: Mahasiswa.java
 * Deskripsi: class yang menyimpan data mahasiswa, mata kuliah, dosen wali, dan kendaraan
 * Pembuat: Olivia Oktaviani (24060124120050)
 * Tanggal: 8 Maret 2026
 */

package Pertemuan3;

import java.util.ArrayList;

public class Mahasiswa {
    // ATRIBUT
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;


    // METHOD
    //konstruktor tanpa parameter(kosong)
    public Mahasiswa(){
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.listMatkul = new ArrayList<>();
    }

    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>();
    }

    //getter
    public String getNIM(){
        return this.nim;
    }

    public String getNama(){
        return this.nama;
    }

    public String getProdi(){
        return this.prodi;
    }

    public Dosen getDosenWali(){
        return this.dosenWali;
    }

    public Kendaraan getKendaraan(){
        return this.kendaraan;
    }

    //setter
    public void setNIM(String nim){
        this.nim = nim;
    }

    public void setNama(String nama){
        this.nama=nama;
    }

    public void setProdi(String prodi){
        this.prodi=prodi;
    }

    public void setDosenWali(Dosen dosenWali){
        this.dosenWali=dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan){
        this.kendaraan=kendaraan;
    }

    //tambah mata kuliah
    public void addMatkul(MataKuliah newMatkul){
        listMatkul.add(newMatkul);
    }

    //mengambil jumlah mata kuliah
    public int getJumlahMatkul(){
        return listMatkul.size();
    }

    //mengambil jumlah SKS
    public int getJumlahSKS(){
        int total = 0;
        for(MataKuliah mk : listMatkul){
            total += mk.getSks();
        }
        return total;
    }

    //print detail mahasiswa
    public void printDetailMhs(){
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        
        if(dosenWali != null){
            System.out.println("Dosen Wali: " + dosenWali.getNama());
            System.out.println("NIP Dosen Wali: " + dosenWali.getNIP());
        }
        if(kendaraan != null){
            System.out.println("Kendaraan: " + kendaraan.getJenisKendaraan());
            System.out.println("Plat Nomor: " + kendaraan.getNomorKendaraan());
        }

        System.out.println("Daftar Mata Kuliah: ");
        for(MataKuliah mk: listMatkul){
            System.out.println("- " + mk.getNamaMatkul());
        }
    }
}
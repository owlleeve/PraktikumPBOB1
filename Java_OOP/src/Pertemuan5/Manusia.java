/* Nama File    : Manusia.java
 * Deskripsi    : Superclass abstract untuk manusia
 * Pembuat      : Olivia Oktaviani (24060124120050)
 * Tanggal      : 24 Maret 2026
 */

package Pertemuan5;

import java.text.NumberFormat;
import java.util.Locale;
import java.time.LocalDate;

public abstract class Manusia {
    // ATRIBUT
    protected String nama;
    protected String alamat;
    protected LocalDate tgl_mulai;
    protected double pendapatan;
    protected static int counterMns = 0;

    // METHOD
    //konstruktor tanpa parameter
    public Manusia() {
        counterMns++;
    }

    //konstruktor dengan parameter
    public Manusia(String nama, String alamat, String tgl_mulai, double pendapatan) {
        this.nama = nama;
        this.alamat = alamat;
        this.tgl_mulai = LocalDate.parse(tgl_mulai);
        this.pendapatan = pendapatan;
        counterMns++;
    }

    // getter nama,alamat,tanggal mulai, dan pendapatan
    public String getNama(){
        return nama; 
    }
    public String getAlamat(){ 
        return alamat; 
    }

    public LocalDate getTglMulai(){ 
        return tgl_mulai; 
    }

    public double getPendapatan(){ 
        return pendapatan; 
    }

    // setter nama,alamat,tanggal mulai, dan pendapatan
    public void setNama(String nama){ 
        this.nama = nama; 
    }

    public void setAlamat(String alamat){ 
        this.alamat = alamat; 
    }

    public void setTglMulai(String tgl_mulai){ 
        this.tgl_mulai = LocalDate.parse(tgl_mulai); 
    }

    public void setPendapatan(double pendapatan){ 
        this.pendapatan = pendapatan; 
    }

    //mengembalikan jumlah objek manusia 
    public static int getCounterMns() {
        return counterMns;
    }

    // abstract hitung masa kerja
    public abstract int hitungMasaKerja();

    //cetak info manusia
    public void cetakInfo() {
        NumberFormat nf = NumberFormat.getInstance(new Locale("id", "ID"));

        System.out.println("Nama           : " + nama);
        System.out.println("Alamat         : " + alamat);
        System.out.println("Tanggal Mulai  : " + tgl_mulai);
        System.out.println("Pendapatan     : Rp " + nf.format(pendapatan));
    }
}


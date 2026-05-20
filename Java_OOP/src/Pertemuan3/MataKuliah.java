/* Nama File: MataKuliah.java
 * Deskripsi: class yang merepresentasikan informasi mata kuliah
 * Pembuat: Olivia Oktaviani (24060124120050)
 * Tanggal: 8 Maret 2026
 */

package Pertemuan3;

public class MataKuliah {
    private String kode;
    private String namaMatkul;
    private int sks;

    // kontruktor kosong
    public MataKuliah(){
        this.kode= "";
        this.namaMatkul= "";
        this.sks = 0;
    }

    // Konstruktor dengan 3 parameter (untuk PBO)
    public MataKuliah(String kode, String namaMatkul, int sks){
        this.kode = kode;
        this.namaMatkul = namaMatkul;
        this.sks = sks;
    }

    // Getter
    public String getNamaMatkul(){
        return this.namaMatkul;
    }

    public int getSks(){
        return this.sks;
    }

    public String getKode(){
        return this.kode;
    }

    //Setter
    public void setKode(String kode){
        this.kode = kode;
    }

    public void setNamaMatkul(String namaMatkul){
        this.namaMatkul=namaMatkul;
    }

    public void setSKS(int sks){
        this.sks= sks;
    }
}
/* Nama File    : MahasiswaSeminar.java
 * Deskripsi    : Kelas Mahasiswa turunan Civitasakademika
 * Pembuat      : Olivia Oktaviani (24060124120050)
 * Tanggal      : 28 April 2026
 */
package PBO07_24060124120050;

public class MahasiswaSeminar extends CivitasAkademika {
    // ATRIBUT
    private String nim;
    private Dosen dosenWali;

    // METHOD
    //konstruktor
    public MahasiswaSeminar(String nama, String nim){
        super(nama);
        this.nim = nim;
        this.dosenWali = null;
    }

    //getter nim
    public String getNim(){ 
        return nim; 
    }

    //getter dosen wali
    public Dosen getDosenWali(){ 
        return dosenWali; 
    }

    //ambil nomor (nim)
    @Override
    public String getNomor(){ 
        return nim; 
    }

    //setter dosen wali
    public void setWali(Dosen dosen){
        this.dosenWali=dosen;
    }

    //tampil data mahasiswa
    public void tampilDataMahasiswa() {
        System.out.println("NIM          : " + nim);
        System.out.println("Nama         : " + nama);
        String namaWali = (dosenWali != null) ? dosenWali.getNama() : "Belum ada";
        System.out.println("Dosen Wali   : " + namaWali);
    }
}
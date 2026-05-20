/* Nama File    : Mahasiswa.java
 * Deskripsi    : Kelas Mahasiswa dengan overloading konstruktor dan method
 * Pembuat      : Olivia Oktaviani (24060124120050)
 * Tanggal      : 26 April 2026
 */
package PBO07_24060124120050;

public class Mahasiswa {
    // ATRIBUT
    private long nim;
    private String nama;
    private String programStudi;

    // KONSTRUKTOR
    //c. konstruktor tanpa parameter
    public Mahasiswa(){
        this.nim = -999;
        this.nama = "n/a";
        this.programStudi = "n/a";
    }

    //d. konstruktor dgn 3 parameter
    public Mahasiswa(long nim, String nama, String programStudi){
        this.nim = nim;
        this.nama = nama;
        this.programStudi = programStudi;
    }

    //e. konstruktor copy/kloning dr objek mahasiswa lain
    public Mahasiswa(Mahasiswa mhs){
        this.nim = mhs.nim;
        this.nama = mhs.nama;
        this.programStudi = mhs.programStudi;
    }

    //getter nim, nama, dan program studi
    public long getNim(){
        return nim; 
    }
    public String getNama(){ 
        return nama; 
    }
    public String getProgramStudi(){ 
        return programStudi; 
    }

    //setter nim dab nama
    public void setNim(long nim){ 
        this.nim = nim; 
    }
    public void setNama(String nama){ 
        this.nama = nama; 
    }

    //overloading setProgramStudi
    //varian 1: tanpa parameter
    public void setProgramStudi(){
        this.programStudi = "Kosong";
    }

    //varian 2: satu parameter string
    public void setProgramStudi(String programStudi){
        this.programStudi = programStudi;
    }

    //varian 3: satu parameter objek Mahasiswa lain
    public void setProgramStudi(Mahasiswa mhs){
        this.programStudi = mhs.programStudi;
    }

    //info mahasiswa
    public void cetakInfo(){
        System.out.println("NIM          : " + nim);
        System.out.println("Nama         : " + nama);
        System.out.println("Program Studi: " + programStudi);
    }
}
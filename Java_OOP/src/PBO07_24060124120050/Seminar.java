/* Nama File    : Seminar.java
 * Deskripsi    : Kelas aplikator Seminar
 * Pembuat      : Olivia Oktaviani (24060124120050)
 * Tanggal      : 29 April 2026
 */
package PBO07_24060124120050;

public class Seminar {
    //ATRIBUT
    //b. array statis
    private static final int MAX_PESERTA = 100;
    private CivitasAkademika[] pesertas;
    private int banyakPeserta;

    // METHOD
    //konstruktor
    public Seminar(){
        this.pesertas = new CivitasAkademika[MAX_PESERTA];
        banyakPeserta = 0;
    }

    //c. hitung jumlah peserta(countPeserta)
    public int countPeserta(){
        return banyakPeserta;
    }

    //d. tambah peserta(registrasi)
    public void registrasi(CivitasAkademika peserta){
        if (banyakPeserta < MAX_PESERTA){
            pesertas[banyakPeserta] = peserta;
            banyakPeserta++;
        }else{
            System.out.println("Seminar sudah penuh, " + peserta.getNama()+ " tidak dapat didaftarkan.");
        }
    }

    //g. tampil semua peserta
    public void tampilPeserta(){
        System.out.println("Daftar Peserta Seminar");
        for (int i = 0; i < banyakPeserta; i++){
            System.out.println((i + 1)+ ". [" + pesertas[i].getNomor()+ "] " + pesertas[i].getNama());
        }
    }

    //h. hitung jumlah mahasiswa
    public int countMahasiswa(){
        int jumlah = 0;
        for (int i = 0; i < banyakPeserta; i++){
            if (pesertas[i] instanceof MahasiswaSeminar){
                jumlah++;
            }
        }
        return jumlah;
    }
}
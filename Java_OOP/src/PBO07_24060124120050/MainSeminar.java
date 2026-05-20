/* Nama File    : MainSeminar.java
 * Deskripsi    : Aplikasi uji kelas Seminar
 * Pembuat      : Olivia Oktaviani (24060124120050)
 * Tanggal      : 29 April 2026
 */
package PBO07_24060124120050;

public class MainSeminar {
    public static void main(String[] args) {
        //e. buat 2 objek dosen & 5 mahasiswa
        Dosen dosen1 = new Dosen("dr. Agus Widodo", "198503012010");
        Dosen dosen2 = new Dosen("prof. Siti Rahayu", "198503012011");

        MahasiswaSeminar mhs1 = new MahasiswaSeminar("Budi Santoso", "24060124120001");
        MahasiswaSeminar mhs2 = new MahasiswaSeminar("Rini Puspita", "24060124120002");
        MahasiswaSeminar mhs3 = new MahasiswaSeminar("Eko Prasetyo", "24060124120003");
        MahasiswaSeminar mhs4 = new MahasiswaSeminar("Dewi Lestari", "24060124120004");
        MahasiswaSeminar mhs5 = new MahasiswaSeminar("Fajar Nugroho", "24060124120005");

        //f. registrasi semua peserta
        Seminar seminar = new Seminar();
        seminar.registrasi(dosen1);
        seminar.registrasi(dosen2);
        seminar.registrasi(mhs1);
        seminar.registrasi(mhs2);
        seminar.registrasi(mhs3);
        seminar.registrasi(mhs4);
        seminar.registrasi(mhs5);

        // tampil jumlah peserta
        System.out.println("Jumlah peserta   : " + seminar.countPeserta());
        System.out.println("Jumlah mahasiswa : " + seminar.countMahasiswa());

        // tampil daftar peserta
        System.out.println();
        seminar.tampilPeserta();

        //i. set dosen wali
        mhs1.setWali(dosen1);
        mhs2.setWali(dosen1);
        mhs3.setWali(dosen2);
        mhs4.setWali(dosen2);
        mhs5.setWali(dosen1);

        //j. tampil data mahasiswa
        System.out.println("\nData Mahasiswa");
        mhs1.tampilDataMahasiswa();
        System.out.println("---");
        mhs2.tampilDataMahasiswa();
        System.out.println("---");
        mhs3.tampilDataMahasiswa();
        System.out.println("---");
        mhs4.tampilDataMahasiswa();
        System.out.println("---");
        mhs5.tampilDataMahasiswa();
    }
}
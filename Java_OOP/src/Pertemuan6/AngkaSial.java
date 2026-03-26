/* Nama File    : AngkaSial.java
 * Deskripsi    : Program penggunaan exception buatan sendiri
                  pengenalan klausa 'throw' dan 'throws'
 * Pembuat      : Olivia Oktaviani (24060124120050)
 * Tanggal      : 26 Maret 2026
 */
package Pertemuan6;

public class AngkaSial {
    public void CobaAngka(int angka) throws AngkaSialException{
        if(angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka+ " bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.CobaAngka(10);
            as.CobaAngka(13);
            as.CobaAngka(12);
        }catch(AngkaSialException ase){
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukan angka!");
        }
    }
}

/* SOAL: 1. Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
         2. Apakah baris 21 pada AngkaSial.java di atas dieksekusi?

JAWAB PERTANYAAN
1. Tidak, baris 12 tidak dieksekusi. Hal ini karena ketika eksepsi terjadi dan perintah throw 
dijalankan, alur program langsung berpindah ke blok catch, sehingga sisa kode di dalam try 
setelah throw akan dilewati.

2. Ya, baris 21 tetap dieksekusi. Setelah blok catch selesai dijalankan, program akan 
melanjutkan ke baris berikutnya di luar try-catch, sehingga kode tersebut tetap berjalan.
 */
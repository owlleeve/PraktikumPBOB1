/* Nama File    : Asersi2.java
 * Deskripsi    : Program untuk demo asersi, yang akan menolak input
                  jari-jari lingkaran yang bernilai nol
 * Pembuat      : Olivia Oktaviani (24060124120050)
 * Tanggal      : 24 Maret 2026
 */
package Pertemuan6;

// class Lingkaran
class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari=jariJari;
    }
    public double hitungKeliling(){
        double keliling= 2*Math.PI*jariJari;
        return keliling;
    }
}

// class Asersi2
public class Asersi2 {
    public static void main(String[] args){
        double jariJari=0;
        assert(jariJari>0): "jari jari tidak boleh nol!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}

/* SOAL: secara konsep, ada yang kurang tepat pada program Asersi2 di atas. Jelaskan!

JAWAB PERTANYAAN
Pada program Asersi2.java, penggunaan asersi kurang tepat karena asersi sebenarnya digunakan 
untuk debugging, bukan untuk validasi input dari pengguna. Selain itu, asersi bisa dinonaktifkan 
saat program dijalankan, jadi kalau dipakai untuk mengecek nilai seperti jari-jari lingkaran, 
hasilnya jadi tidak aman. Sebaiknya validasi dilakukan dengan if-else atau exception.
 */

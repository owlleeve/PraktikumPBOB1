/* Nama File    : Aplikasi.java
 * Deskripsi    : Kelas utama untuk menjalankan semua demonstrasi
 * Pembuat      : Olivia Oktaviani (24060124120050)
 * Tanggal      : 3 Mei 2026
 */
package PBO08_24060124120050;

public class Main {
    public static void main(String[] args) {
        // Kamus Lokal
        Datum<Kucing> d1;
        Datum<Kucing> d2;
        Datum<Anabul> d3;
        Datum<Integer> a, b;
        Datum<String> s1, s2;
        Datum<Anabul> x, y;
        Data<Anabul> kelompokAnabul;
        Data<Kucing> kelompokKucing;

        // Inisialisasi
        d1 = new Datum<>();
        d2 = new Datum<>();
        d3 = new Datum<>();
        a = new Datum<>();
        b = new Datum<>();
        s1 = new Datum<>();
        s2 = new Datum<>();
        x = new Datum<>();
        y = new Datum<>();
        kelompokAnabul = new Data<>();
        kelompokKucing = new Data<>();

        //generik pada class
        System.out.println("\nBagian I: GENERIK PADA CLASS");

        d1.setIsi(new Anggora("Milo", 5.4));
        d2.setIsi(new KembangTelon("Belang", 6.7));
        d3.setIsi(new Anjing("Togo"));

        System.out.println(d1.getIsi().toString());
        System.out.println(d2.getIsi().toString());
        System.out.println(d3.getIsi().getNama());

        //generik pada operator
        System.out.println("\nBagian II: GENERIK PADA OPERATOR");

        //tukar integer
        a.setIsi(5);
        b.setIsi(0);
        System.out.println("Integer - Sebelum Tukar: a=" + a.getIsi() + ", b=" + b.getIsi());
        OperatorGenerik.Tukar(a, b);
        System.out.println("Integer - Sesudah Tukar: a=" + a.getIsi() + ", b=" + b.getIsi());

        //tukan string
        s1.setIsi("Olivia");
        s2.setIsi("Oktaviani");

        System.out.println("String - Sebelum Tukar: a=" + s1.getIsi() + ", b=" + s2.getIsi());
        OperatorGenerik.Tukar(s1, s2);
        System.out.println("String - Sesudah Tukar: a=" + s1.getIsi() + ", b=" + s2.getIsi());

        //tukar sesama kucing
        System.out.println("Kucing - Sebelum Tukar: a=" + d1.getIsi().getNama() + ", b=" + d2.getIsi().getNama());
        OperatorGenerik.Tukar(d1, d2);
        System.out.println("Kucing - Sesudah Tukar: a=" + d1.getIsi().getNama() + ", b=" + d2.getIsi().getNama());

        // tukar sesama Anabul
        x.setIsi(d3.getIsi());
        y.setIsi(d1.getIsi());

        System.out.println("Anabul - Sebelum Tukar: a=" + x.getIsi().getNama() + ", b=" + y.getIsi().getNama());
        OperatorGenerik.Tukar(x, y);
        System.out.println("Anabul - Sesudah Tukar: a=" + x.getIsi().getNama() + ", b=" + y.getIsi().getNama());

        //bobot dari 2 jenis kucing
        double totalBobot = OperatorGenerik.Bobot2(
                d1.getIsi(),
                d2.getIsi());
        System.out.println(
                "Total bobot " + d1.getIsi().getNama() + " dan " + d2.getIsi().getNama() + ": " + totalBobot + " kg");

        //generik pada data
        System.out.println("\nBagian III: GENERIK PADA DATA");

        kelompokAnabul.setIsi(1, d1.getIsi());
        kelompokAnabul.setIsi(2, d2.getIsi());
        kelompokAnabul.setIsi(3, d3.getIsi());

        System.out.println("Isi Data (Anabul) di posisi 1: " + kelompokAnabul.getIsi(1));
        System.out.println("Isi Data (Anabul) di posisi 2: " + kelompokAnabul.getIsi(2));
        System.out.println("Isi Data (Anabul) di posisi 3: " + kelompokAnabul.getIsi(3).getNama());
        System.out.println("Total isi Data: " + kelompokAnabul.getSize());

        kelompokKucing.setIsi(1, d1.getIsi());
        kelompokKucing.setIsi(2, d2.getIsi());

        System.out.println("\nIsi Data (Kucing) di posisi 1: " + kelompokKucing.getIsi(1));
        System.out.println("Isi Data (Kucing) di posisi 2: " + kelompokKucing.getIsi(2));
        System.out.println("Total isi Data: " + kelompokKucing.getSize());

        //hitung total bobot Data<Kucing>
        double totalBobotKucing = OperatorGenerik.Bobot2(
                kelompokKucing.getIsi(1),
                kelompokKucing.getIsi(2));
        System.out.println("Total bobot kucing di Data: " + totalBobotKucing + " kg");
    }
}

/*
KESIMPULAN:
Generik itu intinya cara kita bikin kelas atau method yang fleksibel, kita tidak perlu 
nulis kode yang sama berkali-kali cuma karna tipe datanya beda. Misalnya kelas 
Datum<T>, si T itu kayak "titik kosong" yang belum ditentukan tipenya, baru keisi 
pas kita bikin objeknya, mau diisi Integer, String, Anggora, atau apapun bisa. 

Kalau pakai <T extends Kucing>, berarti kita batasi T-nya harus Kucing atau 
turunannya, jadi kita bisa akses method khusus Kucing seperti getBobot() di dalam 
method generik itu. Intinya generik bikin kode lebih reusable tanpa mengorbankan 
keamanan tipe data.
*/
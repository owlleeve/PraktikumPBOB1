/* Nama File    : OperatorGenerik.java
 * Deskripsi    : Kelas dengan prosedur dan fungsi generik
 * Pembuat      : Olivia Oktaviani (24060124120050)
 * Tanggal      : 3 Mei 2026
 */
package PBO08_24060124120050;

public class OperatorGenerik {
    public static <T> void Tukar(Datum<T> a, Datum<T> b) {
        T temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }

    public static <T extends Kucing> double Bobot2(T a, T b) {
        return a.getBobot() + b.getBobot();
    }
}
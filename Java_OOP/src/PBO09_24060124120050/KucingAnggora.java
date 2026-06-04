/* Nama File    : KucingAnggora.java
 * Deskripsi    : Kelas cucu (subkelas Kucing) - Kucing Anggora
 * Pembuat      : Olivia Oktaviani (24060124120050)
 * Tanggal      : 11 Mei 2026
 */
package PBO09_24060124120050;

public class KucingAnggora extends Kucing {
    private String asalNegara;

    public KucingAnggora(String panggilan, double berat, String asalNegara) {
        super(panggilan, berat);
        this.asalNegara = asalNegara;
    }

    public String getAsalNegara() {
        return asalNegara;
    }

    @Override
    public void gerak() {
        System.out.println(panggilan + " (Anggora) bergerak dengan lincah.");
    }

    @Override
    public void bersuara() {
        System.out.println(panggilan + " (Anggora) berbunyi meong nyaring!");
    }
}
/* Nama File    : KucingPersia.java
 * Deskripsi    : Kelas cucu (subkelas Kucing) - Kucing Persia
 * Pembuat      : Olivia Oktaviani (24060124120050)
 * Tanggal      : 11 Mei 2026
 */
package PBO09_24060124120050;

public class KucingPersia extends Kucing {
    private String warnaRambut;

    public KucingPersia(String panggilan, double berat, String warnaRambut) {
        super(panggilan, berat);
        this.warnaRambut = warnaRambut;
    }

    public String getWarnaRambut() {
        return warnaRambut;
    }

    @Override
    public void gerak() {
        System.out.println(panggilan + " (Persia) bergerak anggun dengan berjalan pelan.");
    }

    @Override
    public void bersuara() {
        System.out.println(panggilan + " (Persia) berbunyi meong lembut!");
    }
}
/* Nama File    : MTeman.java
 * Deskripsi    : Aplikasi koleksi kelas dasar - Teman
 * Pembuat      : Olivia Oktaviani (24060124120050)
 * Tanggal      : 7 Mei 2026
 */
package PBO09_24060124120050;

public class MTeman {
    public static void main(String[] args) {
        Teman t = new Teman();

        // d. addNama
        t.addNama("Budi");
        t.addNama("Citra");
        t.addNama("Dewi");
        t.addNama("Eko");
        t.addNama("Budi");

        // i. showTeman
        System.out.println("=== Daftar Teman ===");
        t.showTeman();

        // a. getNbelm
        System.out.println("\nJumlah teman: " + t.getNbelm());

        // b. getNama(indeks)
        System.out.println("Nama indeks ke-1: " + t.getNama(1));

        // c. setNama
        t.setNama(2, "Diana");
        System.out.println("\nSetelah setNama(2, Diana):");
        t.showTeman();

        // f. isMember
        System.out.println("\nisMember(Eko): " + t.isMember("Eko"));
        System.out.println("isMember(Dewi): " + t.isMember("Zara"));

        // g. gantiNama
        t.gantiNama("Budi", "Bagas");
        System.out.println("\nSetelah gantiNama(Budi -> Bagas):");
        t.showTeman();

        // h. countNama
        System.out.println("\ncountNama(Budi): " + t.countNama("Budi"));
        System.out.println("countNama(Bagas): " + t.countNama("Bagas"));

        // e. delNama
        t.delNama("Eko");
        System.out.println("\nSetelah delNama(Eko):");
        t.showTeman();
        System.out.println("Jumlah teman: " + t.getNbelm());
    }
}
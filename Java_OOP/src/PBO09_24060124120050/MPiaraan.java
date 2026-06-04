/* Nama File    : MPiaraan.java
 * Deskripsi    : Aplikasi koleksi kelas bentukan - Piaraan
 * Pembuat      : Olivia Oktaviani (24060124120050)
 * Tanggal      : 12 Mei 2026
 */
package PBO09_24060124120050;

public class MPiaraan {
    public static void main(String[] args) {
        Piaraan p = new Piaraan();
        p.enqueueAnabul(new Kucing("Mimi", 3.5));
        p.enqueueAnabul(new Anjing("Doggy", 10.0));
        p.enqueueAnabul(new KucingPersia("Fluffy", 4.2, "putih"));
        p.enqueueAnabul(new Burung("Tweety", 0.3));
        p.enqueueAnabul(new KucingAnggora("Luna", 3.8, "Turki"));

        System.out.println("=== Daftar Anabul ===");
        p.showAnabul();

        System.out.println("\n=== Jenis Anabul ===");
        p.showJenisAnabul();

        System.out.println("\nJumlah total: " + p.getNbelm());
        System.out.println("Jumlah kucing: " + p.countKucing());
        System.out.println("\nBobot kucing:");
        p.showBobotKucing();

        System.out.println("\nAnabul terdepan: " + p.getAnabul().getNama());
        Anabul keluar = p.dequeueAnabul();
        System.out.println("Dequeue: " + keluar.getNama());

        System.out.println("\n=== Setelah dequeue ===");
        p.showAnabul();
        System.out.println("Jumlah total: " + p.getNbelm());
    }
}
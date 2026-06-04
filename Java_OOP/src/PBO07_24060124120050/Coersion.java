/* Nama File    : Coersion.java
 * Deskripsi    : Demonstrasi polimorfisme coersion
 * Pembuat      : Olivia Oktaviani (24060124120050)
 * Tanggal      : 26 April 2026
 */
package PBO07_24060124120050;

public class Coersion {
    public static void main(String[] args) {
        // a. konversi tipe dasar
        System.out.println("Konversi Tipe Dasar");
        int nilai = 65;
        System.out.println("Integer : " + nilai);
        System.out.println("Char    : " + (char) nilai);
        System.out.println("Double  : " + (double) nilai);

        // b. konversi real ke integer
        System.out.println("\nKonversi Real ke Integer");
        double nilaiReal = 65.9; // langsung pakai nilai real
        int nilaiIntBaru = (int) nilaiReal;
        System.out.println("Nilai real : " + nilaiReal);
        System.out.println("Ke integer : " + nilaiIntBaru);

        // c. konkatenasi dan penjumlahan integer
        System.out.println("\nKonkatenasi dan Penjumlahan Integer");
        String X = "1234";
        String Y = "5678";
        String S = X + Y;
        int Z = Integer.parseInt(X) + Integer.parseInt(Y);
        System.out.println("X = " + X + ", Y = " + Y);
        System.out.println("S (konkatenasi) = " + S);
        System.out.println("Z (penjumlahan) = " + Z);

        // d. konkatenasi dan penjumlahan double
        System.out.println("\nKonkatenasi dan Penjumlahan Double");
        String P = "12.34";
        String Q = "56.78";
        String R = P + Q;
        double D = Double.parseDouble(P) + Double.parseDouble(Q);
        System.out.println("P = " + P + ", Q = " + Q);
        System.out.println("R (konkatenasi) = " + R);
        System.out.println("D (penjumlahan) = " + D);

        // e. konversi string ke integer
        System.out.println("\nKonversi String S ke Integer A");
        int A = Integer.parseInt(S);
        System.out.println("A (konversi dari S) = " + A);

        // f. konversi integer ke string
        System.out.println("\nKonversi Integer A ke String T");
        String T = Integer.toString(A);
        System.out.println("T (konversi dari A) = " + T);
    }
}
/*
 * Nama : Olivia Oktaviani
 * NIM : 24060124120050
 * File : LambdaMap.java
 * Deskripsi : Menggunakan lambda expression dengan Map.
 */

import java.util.LinkedHashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {

        // Membuat koleksi Map
        Map<String, String> mahasiswaMap = new LinkedHashMap<>();

        // Menambahkan data mahasiswa
        mahasiswaMap.put("24060124120050", "Olivia Oktaviani");
        mahasiswaMap.put("24060124110142", "Muchammad Yuda Tri Ananda");
        mahasiswaMap.put("24060124130123", "Adi");
        mahasiswaMap.put("24060124130124", "Bambang");

        System.out.println("Daftar Data Mahasiswa");

        // Menampilkan key dan value menggunakan lambda expression
        mahasiswaMap.forEach((nim, nama) -> {
            System.out.println("NIM: " + nim + ", Nama: " + nama);
        });
    }
}
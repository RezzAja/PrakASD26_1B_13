import java.util.Scanner;

public class P1_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai tugas (0-100): ");
        double tugas = input.nextDouble();
        
        System.out.print("Masukkan nilai kuis (0-100): ");
        double kuis = input.nextDouble();
        
        System.out.print("Masukkan nilai UTS (0-100): ");
        double uts = input.nextDouble();
        
        System.out.print("Masukkan nilai UAS (0-100): ");
        double uas = input.nextDouble();
        
        // Validasi nilai
        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || 
            uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("nilai tidak valid");
        } else {
            // Hitung nilai akhir
            double nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.3 * uas);
            
            // Tentukan huruf dan kualifikasi
            String huruf;
            double nilaiMutu;
            String kualifikasi;
            String status;
            
            if (nilaiAkhir >= 80 && nilaiAkhir <= 100) {
                huruf = "A";
                nilaiMutu = 4.0;
                kualifikasi = "Sangat Baik";
                status = "LULUS";
            } else if (nilaiAkhir >= 73 && nilaiAkhir < 80) {
                huruf = "B+";
                nilaiMutu = 3.5;
                kualifikasi = "Lebih dari Baik";
                status = "LULUS";
            } else if (nilaiAkhir >= 65 && nilaiAkhir < 73) {
                huruf = "B";
                nilaiMutu = 3.0;
                kualifikasi = "Baik";
                status = "LULUS";
            } else if (nilaiAkhir >= 60 && nilaiAkhir < 65) {
                huruf = "C+";
                nilaiMutu = 2.5;
                kualifikasi = "Lebih dari Cukup";
                status = "LULUS";
            } else if (nilaiAkhir >= 50 && nilaiAkhir < 60) {
                huruf = "C";
                nilaiMutu = 2.0;
                kualifikasi = "Cukup";
                status = "LULUS";
            } else if (nilaiAkhir >= 39 && nilaiAkhir < 50) {
                huruf = "D";
                nilaiMutu = 1.0;
                kualifikasi = "Kurang";
                status = "TIDAK LULUS";
            } else {
                huruf = "E";
                nilaiMutu = 0.0;
                kualifikasi = "Gagal";
                status = "TIDAK LULUS";
            }
            
            // Output hasil
            System.out.println("\n===== HASIL PERHITUNGAN =====");
            System.out.println("Nilai Akhir : " + String.format("%.2f", nilaiAkhir));
            System.out.println("Nilai Huruf : " + huruf);
            System.out.println("Nilai Mutu  : " + nilaiMutu);
            System.out.println("Kualifikasi : " + kualifikasi);
            System.out.println("Status      : " + status);
        }
        
        input.close();
    }
}

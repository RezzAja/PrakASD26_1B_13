import java.util.Scanner;

public class p1_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("========================================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("========================================");
        
        // Array untuk menyimpan data
        String[] namaMK = new String[8];
        double[] nilaiAngka = new double[8];
        String[] nilaiHuruf = new String[8];
        double[] bobotNilai = new double[8];
        
        int jumlahMK = 8;
        
        // Input data mata kuliah dengan nilai angka
        for (int i = 0; i < jumlahMK; i++) {
            System.out.print("masukkan nilai Angka untuk MK " + getNamaMK(i) + ": ");
            nilaiAngka[i] = input.nextDouble();
            namaMK[i] = getNamaMK(i);
            
            // Konversi nilai angka ke huruf
            nilaiHuruf[i] = konversiNilaiHuruf(nilaiAngka[i]);
            bobotNilai[i] = konversiBobot(nilaiAngka[i]);
        }
        
        System.out.println("========================================");
        System.out.println("hasil Konversi Nilai");
        System.out.println("========================================");
        
        // Tampilkan tabel hasil konversi
        System.out.printf("%-35s | %12s | %12s | %12s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        System.out.println("-----64---------------------------------------------------");
        
        double totalBobot = 0;
        for (int i = 0; i < jumlahMK; i++) {
            System.out.printf("%-35s | %12.2f | %12s | %12.2f\n", namaMK[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
            totalBobot += bobotNilai[i];
        }
        
        System.out.println("--------64--------");
        
        // Hitung IP
        double ip = totalBobot / jumlahMK;
        
        System.out.println();
        System.out.printf("IP : %.2f\n", ip);
        
        input.close();
    }
    
    // Method untuk mendapatkan nama MK
    static String getNamaMK(int index) {
        String[] mks = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critical Thinking dan Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja"
        };
        return mks[index];
    }
    
    // Method untuk konversi nilai angka ke huruf
    static String konversiNilaiHuruf(double nilai) {
        if (nilai >= 80 && nilai <= 100) {
            return "A";
        } else if (nilai >= 73 && nilai < 80) {
            return "B+";
        } else if (nilai >= 65 && nilai < 73) {
            return "B";
        } else if (nilai >= 60 && nilai < 65) {
            return "C+";
        } else if (nilai >= 50 && nilai < 60) {
            return "C";
        } else if (nilai >= 39 && nilai < 50) {
            return "D";
        } else {
            return "E";
        }
    }
    
    // Method untuk konversi ke bobot nilai
    static double konversiBobot(double nilai) {
        if (nilai >= 80 && nilai <= 100) {
            return 4.0;
        } else if (nilai >= 73 && nilai < 80) {
            return 3.5;
        } else if (nilai >= 65 && nilai < 73) {
            return 3.0;
        } else if (nilai >= 60 && nilai < 65) {
            return 2.5;
        } else if (nilai >= 50 && nilai < 60) {
            return 2.0;
        } else if (nilai >= 39 && nilai < 50) {
            return 1.0;
        } else {
            return 0.0;
        }
    }
}

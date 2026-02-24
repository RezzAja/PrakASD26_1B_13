public class p1_4 {
    static class Bunga {
        String nama;
        int harga;
        
        Bunga(String nama, int harga) {
            this.nama = nama;
            this.harga = harga;
        }
    }
    
    static class Cabang {
        String nama;
        int[] stock; // [Aglonema, Keladi, Alocasia, Mawar]
        
        Cabang(String nama, int aglonema, int keladi, int alocasia, int mawar) {
            this.nama = nama;
            this.stock = new int[]{aglonema, keladi, alocasia, mawar};
        }
    }
    
    public static void main(String[] args) {
        // Inisialisasi data bunga dengan harga
        Bunga[] bunga = new Bunga[4];
        bunga[0] = new Bunga("Aglonema", 75000);
        bunga[1] = new Bunga("Keladi", 50000);
        bunga[2] = new Bunga("Alocasia", 60000);
        bunga[3] = new Bunga("Mawar", 10000);
        
        // Inisialisasi data cabang dengan stock
        Cabang[] cabang = new Cabang[4];
        cabang[0] = new Cabang("RoyalGarden 1", 10, 5, 15, 7);
        cabang[1] = new Cabang("RoyalGarden 2", 6, 11, 9, 12);
        cabang[2] = new Cabang("RoyalGarden 3", 2, 10, 10, 5);
        cabang[3] = new Cabang("RoyalGarden 4", 5, 7, 12, 9);
        
        System.out.println("======================================");
        System.out.println("RoyalGarden - Manajemen Toko Bunga");
        System.out.println("======================================");
        System.out.println();
        
        // Tampilkan status stock dari setiap cabang
        System.out.println("Status Stock Setiap Cabang:");
        System.out.println("--------------------------------------");
        
        for (int i = 0; i < cabang.length; i++) {
            String status = cekStatusStock(cabang[i].stock);
            System.out.println(cabang[i].nama + " : " + status);
        }
        
        System.out.println();
        System.out.println("======================================");
        System.out.println("Status Cabang Berdasarkan Pendapatan:");
        System.out.println("======================================");
        System.out.println();
        
        // Tampilkan status dari setiap cabang berdasarkan pendapatan
        System.out.printf("%-20s | %15s | %15s\n", "Cabang", "Pendapatan", "Status");
        System.out.println("------------------------------------------");
        
        for (int i = 0; i < cabang.length; i++) {
            long pendapatan = hitungPendapatan(cabang[i].stock, bunga);
            String status = cekStatusCabang(pendapatan);
            System.out.printf("%-20s | Rp%,13d | %15s\n", cabang[i].nama, pendapatan, status);
        }
    }
    
    // Fungsi untuk mengecek status stock bunga
    static String cekStatusStock(int[] stock) {
        for (int s : stock) {
            if (s == 0) {
                return "Tidak Tersedia";
            }
        }
        return "Tersedia";
    }
    
    // Fungsi untuk menghitung pendapatan cabang
    static long hitungPendapatan(int[] stock, Bunga[] bunga) {
        long total = 0;
        for (int i = 0; i < stock.length; i++) {
            total += (long) stock[i] * bunga[i].harga;
        }
        return total;
    }
    
    // Fungsi untuk mengecek status cabang berdasarkan pendapatan
    static String cekStatusCabang(long pendapatan) {
        if (pendapatan > 1500000) {
            return "Sangat Baik";
        } else {
            return "Perlu Evaluasi";
        }
    }
}

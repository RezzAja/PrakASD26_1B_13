public class MataKuliah {
    private String kodeMK;     
    private String nama;       
    private int sks;          
    private int jumlahJam;    

   
    public MataKuliah() {
        this("", "", 0, 0);
    }

   
    public MataKuliah(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK    = kodeMK;
        this.nama      = nama;
        this.sks       = sks;
        this.jumlahJam = jumlahJam;
    }

    
    public void tampilInformasi() {
        System.out.println("Kode MK : " + kodeMK);
        System.out.println("Nama    : " + nama);
        System.out.println("SKS     : " + sks);
        System.out.println("Jam     : " + jumlahJam);
        System.out.println("-----------------------------");
    }

    
    public void ubahSKS(int sksBaru) {
        this.sks = sksBaru;
        System.out.println("SKS telah diubah menjadi " + sks);
    }

   
    public void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println(jam + " jam ditambahkan, jumlah sekarang " + jumlahJam);
    }

    
    public void kurangiJam(int jam) {
        if (jam <= jumlahJam) {
            jumlahJam -= jam;
            System.out.println(jam + " jam dikurangi, jumlah sekarang " + jumlahJam);
        } else {
            System.out.println("Tidak cukup jam untuk dikurangi (" + jumlahJam + ").");
        }
    }

    
    public void setKodeMK(String kodeMK) { this.kodeMK = kodeMK; }
    public void setNama(String nama)       { this.nama = nama; }
    public void setSks(int sks)            { this.sks = sks; }
    public void setJumlahJam(int jam)      { this.jumlahJam = jam; }
}
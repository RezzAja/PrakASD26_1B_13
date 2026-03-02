public class Dosen {
    private String idDosen;         
    private String nama;            
    private boolean statusAktif;    
    private int tahunBergabung;     
    private String bidangKeahlian;  
    
    public Dosen() {
        this("","","",0,false);
    }

    
    public Dosen(String idDosen,
                 String nama,
                 String bidangKeahlian,
                 int tahunBergabung,
                 boolean statusAktif)
    {
        this.idDosen       = idDosen;
        this.nama          = nama;
        this.bidangKeahlian= bidangKeahlian;
        this.tahunBergabung= tahunBergabung;
        this.statusAktif   = statusAktif;
    }

    public void tampilInformasi() {
        System.out.println("ID Dosen       : " + idDosen);
        System.out.println("Nama           : " + nama);
        System.out.println("Bidang keahlian: " + bidangKeahlian);
        System.out.println("Tahun bergabung: " + tahunBergabung);
        System.out.println("Status aktif   : " + (statusAktif ? "Ya" : "Tidak"));
        System.out.println("-----------------------------");
    }

    public void setStatusAktif(boolean status) {
        this.statusAktif = status;
        System.out.println("Status aktif dosen diubah menjadi " + (status ? "aktif" : "tidak aktif"));
    }

    public int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - tahunBergabung;
    }

    public void ubahKeahlian(String bidang) {
        this.bidangKeahlian = bidang;
        System.out.println("Bidang keahlian diubah menjadi " + bidang);
    }

    
    public String getIdDosen() { return idDosen; }
    public void setIdDosen(String idDosen) { this.idDosen = idDosen; }
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }
    public boolean isStatusAktif() { return statusAktif; }
    public int getTahunBergabung() { return tahunBergabung; }
    public void setTahunBergabung(int tahunBergabung) { this.tahunBergabung = tahunBergabung; }
    public String getBidangKeahlian() { return bidangKeahlian; }
}
public class DosenMain {
    public static void main(String[] args) {
        
        Dosen d1 = new Dosen("D001", "Dr. Budi", "Jaringan", 2015, true);

        
        Dosen d2 = new Dosen();
        d2.setIdDosen("D002");
        d2.setNama("Prof. Sari");
        d2.setTahunBergabung(2010);
        d2.setStatusAktif(false);
        d2.ubahKeahlian("Basis Data");

        
        d1.tampilInformasi();
        d2.tampilInformasi();

        
        d1.setStatusAktif(false);
        System.out.println("Masa kerja d1 (2026): " + d1.hitungMasaKerja(2026) + " tahun");
        d2.setStatusAktif(true);
        System.out.println("Masa kerja d2 (2026): " + d2.hitungMasaKerja(2026) + " tahun");
        d1.ubahKeahlian("Keamanan");
        d2.ubahKeahlian("Kecerdasan Buatan");

    
        d1.tampilInformasi();
        d2.tampilInformasi();
    }
}
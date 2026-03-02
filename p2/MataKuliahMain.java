public class MataKuliahMain {
    public static void main(String[] args) {
        
        MataKuliah mk1 = new MataKuliah("IF101", "Algoritma", 3, 45);

    
        MataKuliah mk2 = new MataKuliah();
        mk2.setKodeMK("IF202");
        mk2.setNama("Struktur Data");
        mk2.setSks(4);
        mk2.setJumlahJam(60);

        mk1.tampilInformasi();
        mk2.tampilInformasi();

        mk1.ubahSKS(5);
        mk2.tambahJam(10);
        mk1.kurangiJam(15);
        mk2.kurangiJam(100);   

        mk1.tampilInformasi();
        mk2.tampilInformasi();
    }
}



public class KlinikMain {
    public static void main(String[] args) {
        KlinikDokter klinik = new KlinikDokter();
        klinik.tambahPasien(new Pasien("Budi", "Jakarta", "Flu"));
        klinik.tambahPasien(new Pasien("Andi", "Bandung", "Demam"));
        klinik.tambahPasien(new Pasien("Citra", "Surabaya", "Pusing"));

        System.out.println("Daftar Pasien (Urut Nama Ascending):");
        klinik.tampilkanPasien("nama", true);

        System.out.println("\nDaftar Pasien (Urut Alamat Descending):");
        klinik.tampilkanPasien("alamat", false);

        System.out.println("\nCari Pasien dengan Penyakit Flu:");
        klinik.cariPasien("penyakit", "Flu");
    }
}

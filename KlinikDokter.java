
import java.util.*;

public class KlinikDokter {
    List<Pasien> daftarPasien = new ArrayList<>();

    void tambahPasien(Pasien pasien) {
        daftarPasien.add(pasien);
    }

    void tampilkanPasien(String atribut, boolean ascending) {
        daftarPasien.sort((p1, p2) -> {
            switch (atribut) {
                case "nama":
                    return ascending ? p1.nama.compareTo(p2.nama) : p2.nama.compareTo(p1.nama);
                case "alamat":
                    return ascending ? p1.alamat.compareTo(p2.alamat) : p2.alamat.compareTo(p1.alamat);
                case "penyakit":
                    return ascending ? p1.penyakit.compareTo(p2.penyakit) : p2.penyakit.compareTo(p1.penyakit);
                default:
                    return 0;
            }
        });

        for (Pasien pasien : daftarPasien) {
            System.out.println(pasien);
        }
    }

    void cariPasien(String atribut, String nilai) {
        for (Pasien pasien : daftarPasien) {
            if ((atribut.equals("nama") && pasien.nama.equals(nilai)) ||
                    (atribut.equals("alamat") && pasien.alamat.equals(nilai)) ||
                    (atribut.equals("penyakit") && pasien.penyakit.equals(nilai))) {
                System.out.println(pasien);
            }
        }
    }

    public static void main(String[] args) {

        KlinikDokter klinik = new KlinikDokter();
        klinik.tambahPasien(new Pasien("Budi", "Jakarta", "Flu"));
        klinik.tambahPasien(new Pasien("Andi", "Bandung", "Demam"));
        klinik.tambahPasien(new Pasien("Citra", "Surabaya", "Pusing"));

        System.out.println("Daftar Pasien (Urut Nama Ascending):");
        klinik.tampilkanPasien("nama", true);

        System.out.println("\nCari Pasien dengan Penyakit Flu:");
        klinik.cariPasien("penyakit", "Flu");
    }
}
package week16.Tugas;

public class MataKuliah {
    String kode;
    String nama;
    int sks;

    MataKuliah(String kode, String nama, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }

    public String toString() {
        return "Kode: " + kode + ", Mata Kuliah: " + nama + ", SKS: " + sks;
    }
}

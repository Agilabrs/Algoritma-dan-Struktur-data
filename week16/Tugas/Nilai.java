package week16.Tugas;

public class Nilai {
    Mahasiswa mahasiswa;
    MataKuliah mataKuliah;
    double nilai;

    Nilai(Mahasiswa mahasiswa, MataKuliah mataKuliah, double nilai) {
        this.mahasiswa = mahasiswa;
        this.mataKuliah = mataKuliah;
        this.nilai = nilai;
    }

    public String toString() {
        return "Mahasiswa: " + mahasiswa.nama + ", Mata Kuliah: " + mataKuliah.nama + ", Nilai: " + nilai;
    }
}

package week16.Tugas;

public class Mahasiswa {
    String nim;
    String nama;
    String telepon;

    public Mahasiswa(String nim, String nama, String telepon) {
        this.nim = nim;
        this.nama = nama;
        this.telepon = telepon;
    }

    public String toString() {
        return "NIM: " + nim + ", Nama: " + nama + ", Telepon: " + telepon;
    }
}

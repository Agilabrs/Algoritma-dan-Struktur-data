class Pasien {
    String nama;
    String alamat;
    String penyakit;

    Pasien(String nama, String alamat, String penyakit) {
        this.nama = nama;
        this.alamat = alamat;
        this.penyakit = penyakit;
    }

    public String toString() {
        return "Nama: " + this.nama + ", Alamat: " + this.alamat + ", Penyakit: " + this.penyakit;
    }
}
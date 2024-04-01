package week7;

public class Buku01 {
    int kodeBuku;
    String judulBuku;
    int tahunTerbit;
    String pengarang;
    int stock;

    Buku01(int kodeBuku, String judulBuku, int tahunTerbit, String pengarang, int stock) {
        kodeBuku = this.kodeBuku;
        judulBuku = this.judulBuku;
        tahunTerbit = this.tahunTerbit;
        pengarang = this.pengarang;
        stock = this.stock;
    }

    public void taampilDataBuku() {
        System.out.println("==========================");
        System.out.println("Kode buku :" + kodeBuku);
        System.out.println("Judul buku :" + judulBuku);
        System.out.println("Tahun terbit :" + tahunTerbit);
        System.out.println("Pengarang :" + pengarang);
        System.out.println("Stock :" + stock);

    }
}

package week4;

public class penyewaan {
    public String judul;
    public String pengarang;
    public double harga;

    public penyewaan(String judul, String pengarang, double harga) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.harga = harga;
    }

    public void tampilBuku() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Harga: " + harga);
    }

    public static void menu() {
        System.out.println("==============================");
        System.out.println("|     TAMPIL   MENU          |");
        System.out.println("==============================");
        System.out.println("|   1. Tampil Daftar Buku    |");
        System.out.println("|   2. Harga Pinjam          |");
        System.out.println("|   3. Exit                  |");
        System.out.println("==============================");
        System.out.print("Pilih menu : ");
    }

    public double hitungHarga(int lamaPinjam) {
        return harga * lamaPinjam;
    }
}

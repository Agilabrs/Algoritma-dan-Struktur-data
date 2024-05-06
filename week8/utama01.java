package week8;

import java.util.Scanner;

public class utama01 {
    public static void main(String[] args) {
        gudang01 gudang = new gudang01(7);
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("\n MENU :");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Ambil Barang");
            System.out.println("3. Tampilkan Tumpukan Barang");
            System.out.println("4. Lihat Barang Teratas");
            System.out.println("5. Lihat Barang Terbawah");
            System.out.println("6. Cari Barang");
            System.out.println("7. Keluar");
            System.out.print("Pilih operasi: ");
            int pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang : ");
                    int kode = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Masukkan nama barang : ");
                    String nama = scan.nextLine();
                    System.out.print("Masukkan kategori barang : ");
                    String kategori = scan.nextLine();
                    barang01 barang = new barang01(kode, nama, kategori);
                    gudang.tambahBarang(barang);
                    break;
                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.tampilkanBarang();
                    break;
                case 4:
                    gudang.lihatBarangTeratas();
                    break;
                case 5:
                    gudang.lihatBarangTerbawah();
                    break;
                case 6:
                    System.out.println("Masukkan nama barang yang akan di cari : ");
                    String namaBarang = scan.nextLine();
                    gudang.cariBarang(namaBarang);
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silahkan cobe lagi");
                    break;
            }

        }
    }

}

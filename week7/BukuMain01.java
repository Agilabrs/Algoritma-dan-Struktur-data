package week7;

import java.util.Scanner;

public class BukuMain01 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        PencarianBuku data = new PencarianBuku();
        int jumBuku = 5;

        Buku01[] books = new Buku01[jumBuku];

        System.out.println("-------------------------------------------");
        System.out.print("Masukkan data buku secara urut dari KodeBuku terkecil : ");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("-------------------");
            System.out.print("Kode buku \t:");
            int kodeBuku = s.nextInt();
            System.out.print("Judul buku \t:");
            String judulBuku = s1.next();
            System.out.print("Tahun terbit \t:");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang \t:");
            String pengarang = s1.next();
            System.out.print("Stock \t:");
            int stock = s.nextInt();

            Buku01 m = new Buku01(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            books[i] = m;
            data.tambah(m);
        }

        System.out.println("--------------------------------------------");
        System.out.println("Data keseluruhan buku : ");
        data.tampil();
        System.out.println("--------------------------------------------");
        System.out.println("--------------------------------------------");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan kode buku yang dicari : ");
        System.out.println("Kode Buku : ");
        int cari = s.nextInt();
        System.out.println("Menggunakan sequential search");
        int posisi = data.findSeqSearch(cari);
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);
        System.out.println("==================================");
        System.out.println("memnggunakan ");
        posisi = data.FindBinarySearch(cari, 0, jumBuku - 1);
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);
        s.close();
        s1.close();

    }
}

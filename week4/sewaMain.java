package week4;

import java.util.Scanner;

public class sewaMain {
    public static void main(String[] args) {
        int choose;
        Scanner scan = new Scanner(System.in);
        penyewaan[] buku = new penyewaan[3];
        buku[0] = new penyewaan("Laskar Pelangi", "Andrea Hirata", 46.000);
        buku[1] = new penyewaan("Filosofi Kopi", "Dewi Lestari", 30.000);
        buku[2] = new penyewaan("Tentang Kamu", "Tere Liye", 32.000);

        penyewaan.menu();
        choose = scan.nextInt();
        System.out.println("------------------------------");
        switch (choose) {
            case 1:
                for (penyewaan sewa : buku) {
                    sewa.tampilBuku();
                }
                break;
            case 2:
                for (penyewaan sewa : buku) {
                    sewa.tampilBuku();
                    System.out.println("Harga sewa: " + sewa.hitungHarga(5));
                }
                break;
            case 3:
                System.exit(0);

        }

    }
}

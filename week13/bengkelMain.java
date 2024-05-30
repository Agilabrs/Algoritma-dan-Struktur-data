package week13;

import java.util.Scanner;

public class bengkelMain {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        bengkel01 antri = new bengkel01();

        System.out.println("------------------------");
        System.out.println("BENGKEL LAYANAN TERPADU");
        System.out.println("++++++++++++++++++++++++");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Data Antrian");
            System.out.println("2. Hapus Data Antrian + Tambah Layanan");
            System.out.println("3. Daftar Antrian");
            System.out.println("4. Daftar Layanan");
            System.out.println("5. Total Pemasukan");
            System.out.println("6. Sorting Harga Layanan");
            System.out.print("Pilih menu: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nama Pelanggan: ");
                    String nom = scanner.next();
                    scanner.nextLine();
                    System.out.print("No hp: ");
                    String name = scanner.nextLine();
                    antri.enqueue(name, nom);
                    break;
                case 2:
                    antri.dequeue();
                    System.out.print("Tambah Layanan :");
                    antri.addLayanan(001, 40000, "ganti oli");
                    antri.addLayanan(002, 300000, "servis ringan");
                    antri.printLayan();
                    break;
                case 3:
                    antri.print();
                    break;
                case 4:
                    antri.printLayan();
                    break;
                case 5:
                    int totalHarga = antri.hitungHarga();
                    System.out.println("Total Pemasukan : " + totalHarga);
                    break;
                case 6:
                    System.out.println("List Urutan Layanan : ");
                    antri.sort();
                    break;
                default:
                    scanner.close();
                    System.exit(0);
                    System.out.println("Pilihan menu tidak valid.");
                    break;
            }
        }
    }
}

package week12.tugas;

import java.util.Scanner;

public class vaccine {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        DoubleLinkedListQueue queue = new DoubleLinkedListQueue();
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
        System.out.println("+++++++++++++++++++++++++++++");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengantri Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nomor Antrian: ");
                    int nom = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nama Penerima: ");
                    String name = scanner.nextLine();
                    queue.enqueue(nom, name);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.printQueue();
                    break;
                case 4:
                    System.out.println("Program selesai.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Pilihan menu tidak valid.");
                    break;
            }
        }
    }
}

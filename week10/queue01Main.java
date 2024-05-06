package week10;

import java.util.Scanner;

public class queue01Main {
    public static void menu() {
        System.out.println("Pilih menu : ");
        System.out.println("1. Pembeli baru");
        System.out.println("2. Pembeli Keluar");
        System.out.println("3. Cek Pembeli Terdepan");
        System.out.println("4. Cek Semua Pembeli");
        System.out.println("5. Cek Pembeli Belakang");
        System.out.println("6. Cari Pembeli");
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int Jumlah = sc.nextInt();
        queue antri = new queue(Jumlah);
        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.next();
                    System.out.print("No Hp: ");
                    int noHp = sc.nextInt();
                    Pembeli01 nb = new Pembeli01(nama, noHp);
                    sc.nextLine();
                    antri.enqueue(nb);
                    break;
                case 2:
                    Pembeli01 data = antri.dequeue();
                    if (!" ".equals(data.nama) && data.noHp != 0) {
                        System.out.println("Antrian yang keluar: " + data.nama + " " + data.noHp);
                    }
                    break;
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;
                case 5:
                    antri.peekrear();
                    break;
                case 6:
                    System.out.print("Nama pembeli : ");
                    String namaP = sc.next();
                    nama = namaP;
                    antri.peekPosition(nama);
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6);
    }
}

package week12.tugas;

import java.util.Scanner;

public class filmMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        filmList film = new filmList();

        System.out.println("===================================");
        System.out.println("DATA FILM LAYAR LEBAR");
        System.out.println("===================================");
        int menu;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Tambah Data Indeks Tertentu");
            System.out.println("4. Hapus Data Pertama");
            System.out.println("5. Hapus Data Terakhir");
            System.out.println("6. Hapus Data Tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari ID Film");
            System.out.println("9. Urut Data Rating Film-Desc");
            System.out.println("10. keluar");
            System.out.print("Pilih Menu: ");
            menu = scan.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Masukkan Data Film Posisi Awal :");
                    System.out.print("ID Film: ");
                    int idAwal = scan.nextInt();
                    System.out.print("Judul Film :");
                    String judulAwal = scan.next();
                    System.out.print("Rating Film: ");
                    double ratingAwal = scan.nextDouble();
                    film.addFirst(idAwal, judulAwal, ratingAwal);
                    break;
                case 2:
                    System.out.println("Masukkan Data Film Posisi Akhir :");
                    System.out.print("ID Film: ");
                    int idAkhir = scan.nextInt();
                    System.out.print("Judul Film: ");
                    String judulAkhir = scan.next();
                    System.out.print("Rating Film: ");
                    double ratingAkhir = scan.nextDouble();
                    film.addLast(idAkhir, judulAkhir, ratingAkhir);
                    break;
                case 3:
                    System.out.println("Masukkan Index Data :");
                    int index = scan.nextInt();
                    System.out.print("ID Film: ");
                    int idIndex = scan.nextInt();
                    System.out.print("Judul Film: ");
                    String judulIndex = scan.next();
                    System.out.print("Rating Film: ");
                    double ratingIndex = scan.nextDouble();
                    film.addAtIndex(index, idIndex, judulIndex, ratingIndex);
                    break;
                case 4:
                    film.removeFirst();
                    break;
                case 5:
                    film.removeLast();
                    break;
                case 6:
                    System.out.println("Masukkan Index");
                    int indexHapus = scan.nextInt();
                    film.removeAtIndex(indexHapus);
                    break;
                case 7:
                    System.out.println("Cetak Daftar Film:");
                    film.printFilm();
                    break;
                case 8:
                    System.out.println("Cari Data:");
                    System.out.print("Masukkan ID Film yang ingin dicari: ");
                    int idCari = scan.nextInt();
                    Film filmCari = film.findFilm(idCari);
                    if (filmCari != null) {
                        System.out.println("Film ditemukan: " + filmCari);
                    } else {
                        System.out.println("Film dengan ID tersebut tidak ditemukan.");
                    }
                    break;
                case 9:
                    film.sortDesc();
                    break;
                case 10:
                    System.out.println("Program Selesai.");
                    break;
                default:
                    System.out.println("Menu Tidak Valid.");
                    break;
            }
        } while (menu != 10);
        scan.close();
    }
}

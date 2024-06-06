package week16.Tugas;

import java.util.*;

public class tugasMain {
    static List<Mahasiswa> mahasiswaList = new ArrayList<>();
    static List<MataKuliah> mataKuliahList = new ArrayList<>();
    static List<Nilai> nilaiList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initializeData();

        while (true) {
            System.out.println("***************************************");
            System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
            System.out.println("***************************************");
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Mencari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai");
            System.out.println("5. Keluar");
            System.out.print("Pilih : ");

            int pilihan = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (pilihan) {
                case 1:
                    inputNilai();
                    break;
                case 2:
                    tampilNilai();
                    break;
                case 3:
                    mencariNilaiMahasiswa();
                    break;
                case 4:
                    urutDataNilai();
                    break;
                case 5:
                    System.out.println("Keluar dari program...");
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }

    public static void initializeData() {
        mahasiswaList.add(new Mahasiswa("20001", "Thalhah", "021xxx"));
        mahasiswaList.add(new Mahasiswa("20002", "Zubair", "021xxx"));
        mahasiswaList.add(new Mahasiswa("20003", "Abdur-Rahman", "021xxx"));
        mahasiswaList.add(new Mahasiswa("20004", "Sa'ad", "021xxx"));
        mahasiswaList.add(new Mahasiswa("20005", "Sa'id", "021xxx"));
        mahasiswaList.add(new Mahasiswa("20006", "Ubaidah", "021xxx"));

        mataKuliahList.add(new MataKuliah("0001", "Internet of Things", 3));
        mataKuliahList.add(new MataKuliah("0002", "Algoritma dan Struktur Data", 2));
        mataKuliahList.add(new MataKuliah("0003", "Algoritma dan Pemrograman", 2));
        mataKuliahList.add(new MataKuliah("0004", "Praktikum Algoritma dan Struktur Data", 3));
        mataKuliahList.add(new MataKuliah("0005", "Praktikum Algoritma dan Pemrograman", 3));
    }

    public static void inputNilai() {
        System.out.print("Masukkan kode nilai: ");
        String kode = scanner.nextLine();
        System.out.print("Masukkan nilai: ");
        double nilai = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        System.out.println("DAFTAR MAHASISWA");
        for (Mahasiswa m : mahasiswaList) {
            System.out.println(m);
        }
        System.out.print("Pilih mahasiswa by NIM: ");
        String nim = scanner.nextLine();

        Mahasiswa selectedMahasiswa = null;
        for (Mahasiswa m : mahasiswaList) {
            if (m.nim.equals(nim)) {
                selectedMahasiswa = m;
                break;
            }
        }

        if (selectedMahasiswa == null) {
            System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
            return;
        }

        System.out.println("DAFTAR MATA KULIAH");
        for (MataKuliah mk : mataKuliahList) {
            System.out.println(mk);
        }
        System.out.print("Pilih MK by kode: ");
        String kodeMK = scanner.nextLine();

        MataKuliah selectedMataKuliah = null;
        for (MataKuliah mk : mataKuliahList) {
            if (mk.kode.equals(kodeMK)) {
                selectedMataKuliah = mk;
                break;
            }
        }

        if (selectedMataKuliah == null) {
            System.out.println("Mata Kuliah dengan kode " + kodeMK + " tidak ditemukan.");
            return;
        }

        nilaiList.add(new Nilai(selectedMahasiswa, selectedMataKuliah, nilai));
        System.out.println("Nilai berhasil ditambahkan!");
    }

    public static void tampilNilai() {
        System.out.println("Daftar Nilai Mahasiswa:");
        for (Nilai n : nilaiList) {
            System.out.println(n);
        }
    }

    public static void mencariNilaiMahasiswa() {
        System.out.print("Masukkan nama mahasiswa yang dicari: ");
        String nama = scanner.nextLine();
        boolean found = false;
        for (Nilai n : nilaiList) {
            if (n.mahasiswa.nama.equalsIgnoreCase(nama)) {
                System.out.println(n);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Mahasiswa dengan nama " + nama + " tidak ditemukan.");
        }
    }

    public static void urutDataNilai() {
        nilaiList.sort(Comparator.comparingDouble(n -> n.nilai));
        System.out.println("Data nilai berhasil diurutkan!");
    }
}

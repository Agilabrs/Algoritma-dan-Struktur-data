package Mahasiswa;

import java.util.Scanner;

public class mainMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahMahasiswa = 3;
        Mahasiswa[] mhsArray = new Mahasiswa[jumlahMahasiswa];

        for (int i = 0; i < 3; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan nama: ");
            String nama = sc.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = sc.nextLine();
            System.out.print("Masukkan jenis kelamin (L/P): ");
            String jenisKelamin = sc.nextLine();
            System.out.print("Masukkan IPK: ");
            double ipk = sc.nextDouble();
            mhsArray[i] = new Mahasiswa(nama, nim, jenisKelamin, ipk);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println();
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.println("Nama: " + mhsArray[i].Nama());
            System.out.println("NIM: " + mhsArray[i].Nim());
            System.out.println("Jenis kelamin: " + mhsArray[i].JenisKelamin());
            System.out.println("IPK: " + mhsArray[i].Ipk());
            System.out.println();
        }
        sc.close();

    }
}

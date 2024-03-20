package week5;

import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("----------------------");
        System.out.print("Masukkan jumlah elemen: ");
        int iJml = scan.nextInt();

        Faktorial[] fk = new Faktorial[iJml];
        for (int i = 0; i < iJml; i++) {
            fk[i] = new Faktorial(i);
            System.out.print("Masukkan nilai data ke-" + (i + 1) + ":");
            fk[i].nilai = scan.nextInt();
        }

        System.out.println("HASIL-- BRUTE FORCE");
        for (int i = 0; i < iJml; i++) {
            System.out.println(
                    "hasil perhitungan faktorial menggunakan brute force adalah " + fk[i].faktorialBF(fk[i].nilai));
        }
        System.out.println("HASIL-- DIVIDE AND CONQUER");
        for (int i = 0; i < iJml; i++) {
            System.out.println("hasil perhitungan faktorial menggunakan divide and conquer adalah "
                    + fk[i].faktorialDC(fk[i].nilai));
        }
        scan.close();
    }
}

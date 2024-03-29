package week5;

import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("=======================================");
        System.out.print("Masukkan jumlah elemen yang dihitung : ");
        int elemen = scan.nextInt();

        Pangkat[] png = new Pangkat[elemen];
        for (int i = 0; i < elemen; i++) {
            png[i] = new Pangkat(elemen, i);
            System.out.print("Masukkan nilai yang hendak dipangkatkan : ");
            png[i].nilai = scan.nextInt();
            System.out.print("Masukkan nilai pangkat: ");
            png[i].pangkat = scan.nextInt();
        }

        System.out.println("HASIL PANGKAT -- BRUTE FORCE");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Hasil dari "
                    + png[i].nilai + " pangkat "
                    + png[i].pangkat + " adalah "
                    + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        }
        System.out.println("HASIL PANGKAT -- DIVIDE AND CONQUER");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Hasil dari "
                    + png[i].nilai + " pangkat "
                    + png[i].pangkat + " adalah "
                    + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }
        scan.close();
    }
}

package week5;

import java.util.Scanner;

public class mainMobil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] aks = { 6816, 3921, 4360, 4058, 6255, 3700, 4180, 4180 };
        int[] pow = { 728, 575, 657, 609, 703, 553, 609, 631 };

        mobil[] mbl = new mobil[7];
        for (int i = 0; i < mbl.length; i++) {
            mbl[i] = new mobil();
            mbl[i].akselerasi = aks[i];
            mbl[i].kekuatan = pow[i];
        }
        System.out.println("Pilih Menu: ");
        System.out.println("1. Cari Minimum DQ");
        System.out.println("2. Cari Maximum DQ");
        System.out.println("3. Hitung Rerata DQ");
        System.out.println("==============================");
        int pil = sc.nextInt();
        switch (pil) {
            case 1:
                int akselerasiminim = 0;
                for (int i = 0; i < mbl.length; i++) {
                    akselerasiminim = mbl[i].cariMinimumDQ(aks, 0, aks.length - 1);

                }
                System.out.println("top speed minimum adalah" + akselerasiminim);

                break;
            case 2:
                int akselerasimaksim = 0;
                for (int i = 0; i < mbl.length; i++) {
                    akselerasimaksim = mbl[i].cariMaksimumDQ(aks, 0, aks.length - 1);

                }
                System.out.println("top speed maksimum adalah " + akselerasimaksim);
                break;
            case 3:
                double rerata = mbl[0].hitungRerataBF(pow, pow.length);
                System.out.println("Rerata kekuatan mobil adalah: " + rerata);
                break;
            default:
                System.out.println("Pilihan Salah");
                break;
        }
        sc.close();
    }
}

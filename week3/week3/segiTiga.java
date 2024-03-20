package week3;

import java.util.Scanner;

public class segiTiga {
    public int alas;
    public int tinggi;
    public double miring;

    public segiTiga(int a, int t) {
        alas = a;
        tinggi = t;
        miring = Math.sqrt(a * a + t * t);
    }

    public int getAlas() {
        return alas;
    }

    public int getTinggi() {
        return tinggi;
    }

    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    public double hitungKeliling() {
        return alas + tinggi + miring;
    }

    public double getMiring() {
        return miring;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        segiTiga[] sgArray = new segiTiga[4];

        for (int i = 0; i < 4; i++) {
            System.out.println("segiTiga ke-" + i);
            System.out.print("Masukkan alas: ");
            int alas = sc.nextInt();
            System.out.print("Masukkan tinggi: ");
            int tinggi = sc.nextInt();
            sgArray[i] = new segiTiga(alas, tinggi);
        }
        for (int i = 0; i < 4; i++) {
            System.out.println("Segitiga ke-" + i);
            System.out.println("Alas: " + sgArray[i].getAlas() + ", Tinggi: " + sgArray[i].getTinggi());
            System.out.println("Luas: " + sgArray[i].hitungLuas());
            System.out.println("Keliling: " + sgArray[i].hitungKeliling());
        }
        sc.close();

    }

}

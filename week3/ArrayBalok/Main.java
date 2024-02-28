package ArrayBalok;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahBangunRuang = 3;
        BangunRuang[] bangunRuangArray = new BangunRuang[jumlahBangunRuang];

        for (int i = 0; i < jumlahBangunRuang; i++) {
            System.out.println("Masukkan jenis bangun ruang (1: Kerucut, 2: Limas Segi Empat Sama Sisi, 3: Bola):");
            int jenisBangunRuang = scanner.nextInt();

            if (jenisBangunRuang == 1) {
                System.out.println("Masukkan jari-jari kerucut:");
                double jariJari = scanner.nextDouble();
                System.out.println("Masukkan sisi miring kerucut:");
                double sisiMiring = scanner.nextDouble();
                bangunRuangArray[i] = new Kerucut(jariJari, sisiMiring);
                System.out.println("Luas Permukaan Kerucut: " + bangunRuangArray[i].hitungLuasPermukaan());
                System.out.println("Volume Kerucut :" + bangunRuangArray[i].hitungVolume());
            } else if (jenisBangunRuang == 2) {
                System.out.println("Masukkan panjang sisi alas limas:");
                double panjangSisiAlas = scanner.nextDouble();
                System.out.println("Masukkan tinggi limas:");
                double tinggiLimas = scanner.nextDouble();
                bangunRuangArray[i] = new LimasSegiEmpatSamaSisi(panjangSisiAlas, tinggiLimas);
                System.out.println(
                        "Luas Permukaan limas segi empat sama sisi : " + bangunRuangArray[i].hitungLuasPermukaan());
                System.out.println("Volume limas segi empat sama sisi :" + bangunRuangArray[i].hitungVolume());
            } else if (jenisBangunRuang == 3) {
                System.out.println("Masukkan jari-jari bola:");
                double jariJari = scanner.nextDouble();
                bangunRuangArray[i] = new Bola(jariJari);
                System.out.println("Luas Permukaan Bola: " + bangunRuangArray[i].hitungLuasPermukaan());
                System.out.println("Volume Bola :" + bangunRuangArray[i].hitungVolume());

            }

        }
        scanner.close();
    }
}

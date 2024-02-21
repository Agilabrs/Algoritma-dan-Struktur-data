import java.util.Scanner;

public class array {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 String[] MK = {"Pancasila","Konsep Teknologi Informasi","Critical
Thinking and Problem Solving","Matematika Dasar","Bahasa Inggris",
 "Dasar Pemrograman","Praktikum Dasar Pemrograman",
 "Keselamatan dan Kesehatan Kerja"};
 double[] nilaiAngka = new double[8];
 String[] nilaiHuruf = new String[8];
 double[] bobotNilai = new double[8];
 int[] SKS = {2,2,2,3,2,2,3,2};
 double totalNilai=0,IP;
 for (int i = 1; i <=30; i++) {
 System.out.print("=");
 }
 System.out.println("\nProgram Menghitung IP Semester");
 for (int i = 1; i <=30; i++) {
 System.out.print("=");
 }
 System.out.print("\nMasukkan nilai angka untuk MK Pancasila : ");
 nilaiAngka[0] = sc.nextDouble();
 System.out.print("Masukkan nilai angka untuk MK Konsep Teknologi
Informasi : ");
 nilaiAngka[1]= sc.nextDouble();
 System.out.print("Masukkan nilai angka untuk MK Critical Thinking
and Problem Solving : ");
 nilaiAngka[2]= sc.nextDouble();
 System.out.print("Masukkan nilai angka untuk MK Matematika Dasar :
");
 nilaiAngka[3]= sc.nextDouble();
 System.out.print("Masukkan nilai angka untuk MK Bahasa Inggris :
");
 nilaiAngka[4]= sc.nextDouble();
 System.out.print("Masukkan nilai angka untuk MK Dasar Pemrograman :
");
 nilaiAngka[5]= sc.nextDouble();
 System.out.print("Masukkan nilai angka untuk MK Praktikum Dasar
Pemrograman : ");
 nilaiAngka[6]= sc.nextDouble();
 System.out.print("Masukkan nilai angka untuk MK Keselamatan dan
Kesehatan Kerja : ");
 nilaiAngka[7]= sc.nextDouble();
 for (int i = 0; i < 8; i++) {
 if (nilaiAngka[i] <= 100 && nilaiAngka[i] > 80) {
 nilaiHuruf[i] = "A";
 bobotNilai[i] = 4;
 } else if (nilaiAngka[i] <= 80 && nilaiAngka[i] > 73) {
 nilaiHuruf[i] = "B+";
 bobotNilai[i] = 3.5;
 } else if (nilaiAngka[i] <= 73 && nilaiAngka[i] > 65) {
 nilaiHuruf[i] = "B";
 bobotNilai[i] = 3;
 } else if (nilaiAngka[i] <= 65 && nilaiAngka[i] > 60) {
 nilaiHuruf[i] = "C+";
 bobotNilai[i] = 2.5;
 } else if (nilaiAngka[i] <= 60 && nilaiAngka[i] > 50) {
 nilaiHuruf[i] = "C";
 bobotNilai[i] = 2;
 } else if (nilaiAngka[i] <= 50 && nilaiAngka[i] > 39) {
 nilaiHuruf[i] = "D";
 bobotNilai[i] = 1;
 } else if (nilaiAngka[i] <= 39) {
 nilaiHuruf[i] = "E";
 bobotNilai[i] = 0;
 }
 }
 for (int i = 1; i <=30; i++) {
 System.out.print("=");
 }
 System.out.println();
 System.out.println("Hasil Konversi Nilai");
 for (int i = 1; i <=30; i++) {
 System.out.print("=");
 }
 System.out.println();
 System.out.printf("%-40s %-12s %-8s %-13s\n","MK", "Nilai
Angka", "Nilai Huruf", "Bobot Nilai");
 for (int i = 0; i < nilaiAngka.length; i++) {
 System.out.printf("%-43s %.2f %-12s %.2f\n",MK[i],
nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
 }
 System.out.println();
 for (int i = 1; i <=30; i++) {
 System.out.print("=");
 }
 System.out.println();
 for (int i = 0; i < bobotNilai.length; i++) {
 totalNilai += (bobotNilai[i]*SKS[i]);
 }
 IP = totalNilai / 18;
 System.out.printf("IP = %.2f",IP);
 }
}

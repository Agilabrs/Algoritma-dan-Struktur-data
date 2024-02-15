import java.util.Scanner;

public class nilaiAkhir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program Menghitung nilai Akhir");
        System.out.println("======================x");
        System.out.print("Masukkan nilai tugas: ");
        int nilaiTugas = scanner.nextInt();
        if (nilaiTugas < 0 || nilaiTugas > 100) {
            System.out.println("Nilai tidak valid");
            return;
        }

        System.out.print("Masukkan nilai kuis: ");
        int nilaiKuis = scanner.nextInt();
        if (nilaiKuis < 0 || nilaiKuis > 100) {
            System.out.println("Nilai tidak valid");
            return;
        }

        System.out.print("Masukkan nilai UTS: ");
        int nilaiUTS = scanner.nextInt();
        if (nilaiUTS < 0 || nilaiUTS > 100) {
            System.out.println("Nilai tidak valid");
            return;
        }

        System.out.print("Masukkan nilai UAS: ");
        int nilaiUAS = scanner.nextInt();
        if (nilaiUAS < 0 || nilaiUAS > 100) {
            System.out.println("Nilai tidak valid");
            return;
        }
        System.out.println("======================x");

        double nilaiAkhir = 0.2 * nilaiTugas + 0.2 * nilaiKuis + 0.3 * nilaiUTS + 0.4 * nilaiUAS;

        String[] nilaiHuruf = { "A", "B+", "B", "C+", "C", "D", "E" };
        int[] batasNilai = { 80, 73, 65, 60, 50, 39, 0 };

        String nilaiHurufAkhir = "TIDAK LULUS";
        for (int i = 0; i < batasNilai.length; i++) {
            if (nilaiAkhir >= batasNilai[i]) {
                nilaiHurufAkhir = nilaiHuruf[i];
                break;
            }
        }
        System.out.println("======================x");
        System.out.println("Nilai akhir: " + nilaiAkhir);
        System.out.println("Nilai huruf: " + nilaiHurufAkhir);
        System.out.println("======================x");
        System.out.println("======================x");
        System.out.println(
                nilaiHurufAkhir.equals("A") || nilaiHurufAkhir.equals("B+") || nilaiHurufAkhir.equals("B")
                        ? "SELAMAT ANDA LULUS"
                        : "TIDAK LULUS");
    }
}

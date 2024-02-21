import java.util.Scanner;

public class tampilBilangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input NIM: ");
        String nim = scanner.nextLine();
        int lastTwoDigits = Integer.parseInt(nim.substring(nim.length() - 2));

        // Generate deret dan cetak hasil
        String output = generateSeries(lastTwoDigits);
        System.out.println("OUTPUT: " + output);
        scanner.close();
    }

    public static String generateSeries(int n) {
        // Jika n < 10, tambahkan 10
        if (n < 10) {
            n += 10;
        }

        StringBuilder series = new StringBuilder();

        // Buat deret dari 1 sampai n (tidak termasuk 6 dan 10)
        for (int i = 1; i <= n; i++) {
            if (i != 6 && i != 10) {
                // Cetak angka ganjil dengan asterik
                if (i % 2 == 1) {
                    series.append("* ");
                } else {
                    // Cetak angka genap sesuai bilangan aslinya
                    series.append(i).append(" ");
                }
            }
        }

        return series.toString().trim();
    }
}

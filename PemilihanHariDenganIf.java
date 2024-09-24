import java.util.Scanner;

public class PemilihanHariDenganIf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dayNumber;

        // Meminta input bilangan bulat dari pengguna
        System.out.print("Masukkan nomor hari (1-7): ");
        dayNumber = sc.nextInt();

        // Menggunakan if-else untuk menentukan jenis hari
        if (dayNumber >= 1 && dayNumber <= 5) {
            System.out.println("Weekday");
        } else if (dayNumber == 6 || dayNumber == 7) {
            System.out.println("Weekend");
        } else {
            System.out.println("Invalid Number");
        }
    }
}

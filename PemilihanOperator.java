import java.util.Scanner;

public class PemilihanOperator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double angka1, angka2, hasil = 0;
        char operator;

        System.out.print("Masukkan angka 1: ");
        angka1 = sc.nextDouble();
        System.out.print("Masukkan angka 2: ");
        angka2 = sc.nextDouble();
        System.out.print("Masukkan operator (+ - * /): ");
        operator = sc.next().charAt(0);

        // Menggunakan if-else untuk pemilihan operator
        if (operator == '+') {
            hasil = angka1 + angka2;
        } else if (operator == '-') {
            hasil = angka1 - angka2;
        } else if (operator == '*') {
            hasil = angka1 * angka2;
        } else if (operator == '/') {
            if (angka2 != 0) {
                hasil = angka1 / angka2;
            } else {
                System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                return; // Keluar dari program
            }
        } else {
            System.out.println("Error: Operator yang dipilih tidak sesuai. Silakan pilih antara +, -, *, atau /.");
            return; // Keluar dari program
        }

        System.out.println(angka1 + " " + operator + " " + angka2 + " = " + hasil);
    }
}

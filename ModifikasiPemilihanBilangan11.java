import java.util.Scanner;

public class ModifikasiPemilihanBilangan11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka: ");
        int angka = sc.nextInt();

        String jenisBilangan = (angka % 2 == 0) ? "genap" : "ganjil";
        System.out.print("Angka " + angka + " termasuk bilangan " + jenisBilangan);
         
        

   
}
}
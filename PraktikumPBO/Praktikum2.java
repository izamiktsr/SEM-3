import java.util.Scanner;

public class Praktikum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angka1 = sc.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        double angka2 = sc.nextDouble();

        double hasil = 0;

        // Struktur if untuk operasi
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
                System.out.println("Error: pembagian dengan nol!");
                sc.close();
                return;
            }
        } else {
            System.out.println("Operator tidak valid!");
            sc.close();
            return;
        }

        System.out.println("Hasil: " + hasil);
        sc.close();
    }
}

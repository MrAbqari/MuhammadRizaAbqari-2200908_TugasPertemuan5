package tugas.pkg5.pbo;

import java.util.Scanner;
        
public class Soal2 {
    static boolean Prima(int angka) {
        if (angka < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(angka); i++) {
            if (angka % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan batas awal: ");
        int batasAwal = scanner.nextInt();

        System.out.print("Masukan batas akhir: ");
        int batasAkhir = scanner.nextInt();

        if (batasAwal < 1 || batasAkhir > 100 || batasAwal > batasAkhir) {
            System.out.println("Input tidak valid. Pastikan batasAwal >= 1 dan batasAkhir <= 100.");
            return;
        }

        System.out.print("Bilangan prima " + batasAwal + " sd " + batasAkhir + " adalah: ");
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (Prima(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.print("\nBilangan komposit " + batasAwal + " sd " + batasAkhir + " adalah: ");
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (!Prima(i)) {
                System.out.print(i + " ");
            }
        }
    }
}

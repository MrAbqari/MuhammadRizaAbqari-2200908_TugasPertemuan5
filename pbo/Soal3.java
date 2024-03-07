package tugas.pkg5.pbo;

import java.util.Scanner;

public class Soal3 {
    static void cetak(int n) {
        System.out.println("Output:");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai (1-1000): ");
        int n = scanner.nextInt();
        
        if (n < 1 || n > 1000) {
            System.out.println("Nilai tidak valid.");
            return;
        }
        
        cetak(n);
    }
}

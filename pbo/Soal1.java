package tugas.pkg5.pbo;

import java.util.Scanner;

public class Soal1 {
    static boolean cekRibuan(int angka) {
        return angka > 999 && angka < 10000;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Berapa bilangan integer yang akan dicheck : ");
        int n = scanner.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            int angka = scanner.nextInt();
            
            if (cekRibuan(angka)) {
                System.out.println("Angka ke-" + i + " merupakan bilangan ribuan.");
            } else {
                System.out.println("Angka ke-" + i + " bukan bilangan ribuan.");
            }
        }
    }
}

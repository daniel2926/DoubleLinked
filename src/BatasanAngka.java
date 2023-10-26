import java.util.Scanner;

public class BatasanAngka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        for (;;) {
            System.out.print("Masukkan angka (1 <= n <= 20): ");
             n = scanner.nextInt();

            if (n >= 1 && n <= 20) {
                System.out.println("Anda telah memasukkan angka yang valid: " + n);
                break;
            } else {
                System.out.println("Angka harus berada dalam rentang 1 hingga 20. Coba lagi.");
            }
        }

//        do {
//            System.out.print("Masukkan angka (1 <= n <= 20): ");
//            n = scanner.nextInt();
//
//            if (n < 1 || n > 20) {
//                System.out.println("Angka harus berada dalam rentang 1 hingga 20. Coba lagi.");
//            }
//        } while (n < 1 || n > 20);
//
//        System.out.println("Anda telah memasukkan angka yang valid: " + n);
//    }
    }
}
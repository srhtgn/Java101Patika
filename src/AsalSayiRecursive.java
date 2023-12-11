import java.util.Scanner;

public class AsalSayiRecursive {
    static boolean isPrime(int number, int divisor) {
        if (number <= 1) {
            return false;
        }
        if (divisor == 1) {
            return true;
        }
        if (number % divisor == 0) {
            return false;
        }
        return isPrime(number, divisor - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Sayı Giriniz: ");
            int number = scanner.nextInt();

            if (isPrime(number, number / 2)) {
                System.out.println(number + " sayısı ASALDIR!");
            } else {
                System.out.println(number + " sayısı ASAL değildir!");
            }

            System.out.print("Devam etmek istiyor musunuz? (E/H): ");
            String choice = scanner.next().toUpperCase();

            if (!choice.equals("E")) {
                break;
            }
        }

        scanner.close();
    }
}

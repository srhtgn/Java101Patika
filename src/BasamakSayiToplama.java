
import java.util.Scanner;

public class BasamakSayiToplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        int sum = 0;
        int remainder;

        while (number != 0) {
            remainder = number % 10;
            sum += remainder;
            number /= 10;
        }

        System.out.println("Basamak sayılarının toplamı: " + sum);
    }
}

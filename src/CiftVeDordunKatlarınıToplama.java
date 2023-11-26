import java.util.Scanner;
public class CiftVeDordunKatlarınıToplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int number;

        do {
            System.out.print("Bir sayı girin (Çıkış için tek bir sayı girin): ");
            number = scanner.nextInt();

            if (number % 2 == 0 && number % 4 == 0) {
                total += number;
            }

        } while (number % 2 != 1);

        System.out.println("Girilen çift ve 4'ün katları olan sayıların toplamı: " + total);

        scanner.close();
    }
}
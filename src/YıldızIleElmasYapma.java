import java.util.Scanner;
public class YıldızIleElmasYapma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Elmasın yüksekliğini girin (tek sayı olmalı): ");
        int height = scanner.nextInt();

        if (height % 2 == 0) {
            System.out.println("Lütfen tek sayı girin.");
            return;
        }

        for (int i = 0; i < height / 2 + 1; i++) {
            for (int j = 0; j < height / 2 - i; j++)
                System.out.print(" ");

            for (int k = 0; k < 2 * i + 1; k++)
                System.out.print("*");

            System.out.println();
        }

        for (int i = height / 2 - 1; i >= 0; i--) {
            for (int j = 0; j < height / 2 - i; j++)
                System.out.print(" ");

            for (int k = 0; k < 2 * i + 1; k++)
                System.out.print("*");

            System.out.println();
        }
    }
}

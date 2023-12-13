import java.util.Scanner;

public class DeseneGoreMetotOlusturma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N sayısını girin: ");
        int n = scanner.nextInt();

        printPattern(n);

        scanner.close();
    }

    static void printPattern(int n) {
        if (n <= 0) {
            System.out.print(n + " ");
            return;
        }

        System.out.print(n + " ");
        printPattern(n - 5);
        System.out.print(n + " ");
    }
}
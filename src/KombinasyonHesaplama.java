import java.util.Scanner;
public class KombinasyonHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n'yi girin: ");
        int n = scanner.nextInt();

        System.out.print("r'yi girin: ");
        int r = scanner.nextInt();

        long combination = calculateCombination(n, r);

        System.out.println("C(" + n + ", " + r + ") = " + combination);

        scanner.close();
    }
    public static long factorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }
    public static long calculateCombination(int n, int r) {
        if (n < r) {
            return 0;
        }

        long combination = factorial(n) / (factorial(r) * factorial(n - r));
        return combination;
    }
}

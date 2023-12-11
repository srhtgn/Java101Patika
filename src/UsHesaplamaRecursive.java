import java.util.Scanner;

public class UsHesaplamaRecursive {

    static int calculatePower(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * calculatePower(base, exponent - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Taban değeri giriniz: ");
            int base = scanner.nextInt();

            System.out.print("Üs değerini giriniz: ");
            int exponent = scanner.nextInt();

            int result = calculatePower(base, exponent);

            System.out.println("Sonuç: " + result);

            System.out.print("Devam etmek istiyor musunuz? (E/H): ");
            String choice = scanner.next().toUpperCase();

            if (!choice.equals("E")) {
                break;
            }
        }

        scanner.close();
    }
}

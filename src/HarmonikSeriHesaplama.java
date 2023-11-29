import java.util.Scanner;
public class HarmonikSeriHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n = scanner.nextInt();

        double harmonicSum = 0.0;
        for (int i = 1; i <= n; i++) {
            harmonicSum += 1.0 / i;
        }

        System.out.println("Harmonik seri: " + harmonicSum);
    }
}

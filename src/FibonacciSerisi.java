import java.util.Scanner;
public class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Fibonacci serisinin eleman sayısını girin: ");
        double n = scanner.nextInt();

        System.out.println(n + " Elemanlı Fibonacci Serisi:");

        double first = 0, second = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");

            double next = first + second;
            first = second;
            second = next;
        }

        scanner.close();
    }
}
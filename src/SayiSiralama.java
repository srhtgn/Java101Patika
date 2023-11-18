import java.util.Scanner;

public class SayiSiralama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        int num1 = scanner.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int num2 = scanner.nextInt();

        System.out.print("Üçüncü sayıyı giriniz: ");
        int num3 = scanner.nextInt();

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if (num2 > num3) {
            int temp = num2;
            num2 = num3;
            num3 = temp;

            if (num1 > num2) {
                int temp2 = num1;
                num1 = num2;
                num2 = temp2;
            }
        }

        System.out.println("Sıralama: " + num1 + " " + num2 + " " + num3);

        scanner.close();
    }
}

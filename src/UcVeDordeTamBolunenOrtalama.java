import java.util.Scanner;
public class UcVeDordeTamBolunenOrtalama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int number = scanner.nextInt();

        int sum = 0;
        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum = sum + i;
                count++;
            }
        }


        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("3'e ve 4'e tam bölünen sayıların ortalaması: " + average);
        } else {
            System.out.println("3'e ve 4'e tam bölünen sayı bulunamadı.");
        }

        scanner.close();
    }
}
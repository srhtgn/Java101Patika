import java.util.Scanner;

public class EBOBveEKOKBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        int sayi1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = input.nextInt();

        int ebob = 1;
        int buyukSayi = Math.max(sayi1, sayi2);

        for (int i = 1; i <= buyukSayi; i++) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
            }
        }

        int ekok = (sayi1 * sayi2) / ebob;

        System.out.println("Girilen sayıların EBOB'u: " + ebob);
        System.out.println("Girilen sayıların EKOK'u: " + ekok);

        input.close();
    }
}

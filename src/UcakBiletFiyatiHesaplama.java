import java.util.Scanner;

public class UcakBiletFiyatiHesaplama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi (KM) girin: ");
        int distance = scanner.nextInt();

        System.out.print("Yaşınızı girin: ");
        int age = scanner.nextInt();

        System.out.print("Yolculuk tipini seçin (1: Tek Yön, 2: Gidiş-Dönüş): ");
        int travelType = scanner.nextInt();

        if (distance <= 0 || age <= 0 || (travelType != 1 && travelType != 2)) {
            System.out.println("Hatalı Veri Girdiniz!");
            return;
        }

        double price = distance * 0.10;

        if (age < 12) {
            price *= 0.5;
        } else if (age >= 12 && age <= 24) {
            price *= 0.9;
        } else if (age >= 65) {
            price *= 0.7;
        }

        if (travelType == 2) {
            price *= 0.8;
            price *= 2;
        }

        System.out.println("Toplam Bilet Fiyatı: " + price + " TL");

        scanner.close();
    }
}

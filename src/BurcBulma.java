import java.util.Scanner;
public class BurcBulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Doğduğunuz günü giriniz: ");
        int day = scanner.nextInt();

        System.out.print("Doğduğunuz ayı giriniz (sayı olarak): ");
        int month = scanner.nextInt();

        String horoscope = "";

        if ((month == 3 && day >= 21) || (month == 4 && day <= 20)) {
            horoscope = "Koç";
        } else if ((month == 4 && day >= 21) || (month == 5 && day <= 21)) {
            horoscope = "Boğa";
        } else if ((month == 5 && day >= 22) || (month == 6 && day <= 22)) {
            horoscope = "İkizler";
        } else if ((month == 6 && day >= 23) || (month == 7 && day <= 22)) {
            horoscope = "Yengeç";
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            horoscope = "Aslan";
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            horoscope = "Başak";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            horoscope = "Terazi";
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            horoscope = "Akrep";
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            horoscope = "Yay";
        } else if ((month == 12 && day >= 22) || (month == 1 && day <= 21)) {
            horoscope = "Oğlak";
        } else if ((month == 1 && day >= 22) || (month == 2 && day <= 19)) {
            horoscope = "Kova";
        } else if ((month == 2 && day >= 20) || (month == 3 && day <= 20)) {
            horoscope = "Balık";
        } else {
            System.out.println("Geçersiz tarih girişi!");
            return;
        }

        System.out.println("Burcunuz: " + horoscope);

        scanner.close();
    }
}

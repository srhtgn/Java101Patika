import java.util.Scanner;

public class ManavKasaProgramı {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pearPrice = 2.14;
        double applePrice = 3.67;
        double tomatoPrice = 1.11;
        double bananaPrice = 0.95;
        double eggplantPrice = 5.00;

        System.out.print("Armut Kaç Kilo? : ");
        double pearKilos = scanner.nextDouble();

        System.out.print("Elma Kaç Kilo? : ");
        double appleKilos = scanner.nextDouble();

        System.out.print("Domates Kaç Kilo? : ");
        double tomatoKilos = scanner.nextDouble();

        System.out.print("Muz Kaç Kilo? : ");
        double bananaKilos = scanner.nextDouble();

        System.out.print("Patlıcan Kaç Kilo? : ");
        double eggplantKilos = scanner.nextDouble();

        double totalCost = (appleKilos * applePrice) +
                (pearKilos * pearPrice) +
                (tomatoKilos * tomatoPrice) +
                (bananaKilos * bananaPrice) +
                (eggplantKilos * eggplantPrice);

        System.out.println("Toplam Tutar : " + totalCost + " TL");

        scanner.close();
    }
}
import java.util.Scanner;

public class TaksimetreHesaplamaProgramı {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi (KM) giriniz: ");
        double mesafe = scanner.nextDouble();

        double taksimetreTutar = hesaplaTaksimetreTutari(mesafe);

        System.out.println("Taksimetre Tutarı: " + taksimetreTutar + " TL");

        scanner.close();
    }

    public static double hesaplaTaksimetreTutari(double mesafe) {

        double acilisUcreti = 10.0;

        double kmBasinaUcret = 2.20;

        double minimumTutar = 20.0;

        double taksimetreTutar = acilisUcreti + (mesafe * kmBasinaUcret);

        taksimetreTutar = (taksimetreTutar < minimumTutar) ? minimumTutar : taksimetreTutar;

        return taksimetreTutar;
    }
}

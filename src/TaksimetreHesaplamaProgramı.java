import java.util.Scanner;

public class TaksimetreHesaplamaProgramı {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mesafeyi kullanıcıdan al
        System.out.print("Mesafeyi (KM) giriniz: ");
        double mesafe = scanner.nextDouble();

        // Taksimetre hesaplaması
        double taksimetreTutar = hesaplaTaksimetreTutari(mesafe);

        // Sonucu ekrana yazdır
        System.out.println("Taksimetre Tutarı: " + taksimetreTutar + " TL");

        // Scanner'ı kapat
        scanner.close();
    }

    // Taksimetre tutarını hesaplayan fonksiyon
    public static double hesaplaTaksimetreTutari(double mesafe) {
        // Taksimetre açılış ücreti
        double acilisUcreti = 10.0;

        // KM başına ücret
        double kmBasinaUcret = 2.20;

        // Minimum ödenecek tutar
        double minimumTutar = 20.0;

        // Taksimetre tutarını hesapla
        double taksimetreTutar = acilisUcreti + (mesafe * kmBasinaUcret);

        // Minimum tutara kontrolü

        taksimetreTutar = (taksimetreTutar < minimumTutar) ? minimumTutar : taksimetreTutar;

        return taksimetreTutar;
    }
}

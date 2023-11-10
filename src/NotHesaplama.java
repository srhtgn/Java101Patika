import java.util.Scanner;

public class NotHesaplama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan sınav puanlarını alma
        System.out.print("Matematik sınav puanınızı girin: ");
        double matematik = scanner.nextDouble();

        System.out.print("Fizik sınav puanınızı girin: ");
        double fizik = scanner.nextDouble();

        System.out.print("Kimya sınav puanınızı girin: ");
        double kimya = scanner.nextDouble();

        System.out.print("Türkçe sınav puanınızı girin: ");
        double turkce = scanner.nextDouble();

        System.out.print("Tarih sınav puanınızı girin: ");
        double tarih = scanner.nextDouble();

        System.out.print("Müzik sınav puanınızı girin: ");
        double muzik = scanner.nextDouble();

        // Ortalamayı hesaplama
        double ortalama = (matematik + fizik + kimya + turkce + tarih + muzik) / 6;

        // Sonucu ekrana bastırma
        System.out.println("Ortalama: " + ortalama);

        // Not durumunu belirleme
        if (ortalama >= 60) {
            System.out.println("Geçtiniz!");
        } else {
            System.out.println("Kaldınız!");
        }

        // Scanner kapatma
        scanner.close();
    }
}

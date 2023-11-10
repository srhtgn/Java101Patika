import java.util.Scanner;
public class KDVHesaplama {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Kullanıcıdan para değerini alma
            System.out.print("Lütfen para değerini girin: ");
            double paraDegeri = scanner.nextDouble();

            // KDV oranı
            double kdvOrani = 0;
            if(paraDegeri > 1000){
                kdvOrani = 0.08;
            } else if (paraDegeri <= 1000 && paraDegeri > 0 ) {
                kdvOrani = 0.18;
            }else {
                System.out.println("Lütfen geçerli bir değer girin");
                return;
            }


            // KDV'li fiyatı hesaplama
            double kdvliFiyat = paraDegeri + (paraDegeri * kdvOrani);

            // KDV tutarını hesaplama
            double kdvTutari = paraDegeri * kdvOrani;



            // Sonuçları ekrana bastırma
            System.out.println("KDV'li Fiyat: " + kdvliFiyat);
            System.out.println("KDV Tutarı: " + kdvTutari);

            // Scanner kapatma
            scanner.close();
        }

}

import java.util.Scanner;

public class UcgenAlanHesaplama {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Üçgenin birinci kenar uzunluğunu girin: ");
        double kenar1 = scanner.nextDouble();

        System.out.print("Üçgenin ikinci kenar uzunluğunu girin: ");
        double kenar2 = scanner.nextDouble();

        System.out.print("Üçgenin üçüncü kenar uzunluğunu girin: ");
        double kenar3 = scanner.nextDouble();

        if (isValidTriangle(kenar1, kenar2, kenar3)) {
            double alan = triangleArea(kenar1, kenar2, kenar3);
            System.out.println("Üçgenin Alanı: " + alan);
        } else {
            System.out.println("Geçersiz üçgen. Lütfen geçerli kenar uzunlukları girin.");
        }
        scanner.close();
    }

    public static boolean isValidTriangle(double kenar1, double kenar2, double kenar3) {
        return (kenar1 + kenar2 > kenar3) && (kenar1 + kenar3 > kenar2) && (kenar2 + kenar3 > kenar1);
    }

    public static double triangleArea(double kenar1, double kenar2, double kenar3) {
        double s = (kenar1 + kenar2 + kenar3) / 2;
        return Math.sqrt(s * (s - kenar1) * (s - kenar2) * (s - kenar3));
    }
}

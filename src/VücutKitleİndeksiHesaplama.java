import java.util.Scanner;

public class VücutKitleİndeksiHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Boy (metre cinsinden) girin: ");
        double boy = scanner.nextDouble();

        System.out.print("Kilo (kg cinsinden) girin: ");
        double kilo = scanner.nextDouble();

        double vucutKitleIndeksi = kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksi: " + vucutKitleIndeksi);

        scanner.close();
    }
}

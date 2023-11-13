import java.util.Scanner;

public class DaireDilimiAlanıHesaplama {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Yarıçapı (r) girin: ");
        double r = scanner.nextDouble();

        System.out.print("Merkez açısının ölçüsünü (𝛼) girin: ");
        double alpha = scanner.nextDouble();

        double pi = 3.14;

        double alan = (pi * Math.pow(r, 2) * alpha) / 360;

        System.out.println("Daire dilimi alanı: " + alan);

        scanner.close();
    }
}

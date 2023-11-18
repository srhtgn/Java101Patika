import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlikOnerme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sıcaklık giriniz: ");
        int temperature = scanner.nextInt();

        String activity;


        activity = (temperature < 5) ? "Kayak yapabilirsiniz" :
                (temperature >= 5 && temperature <= 15) ? "Sinemaya  gidebilirsiniz" :
                        (temperature >= 15 && temperature <= 25) ? "Piknik yapabilirsiniz" : "Yüzmeye gidebilirsiniz";

        System.out.println(activity);

        scanner.close();
    }
}
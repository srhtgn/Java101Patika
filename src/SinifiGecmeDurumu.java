import java.util.Scanner;

public class SinifiGecmeDurumu {

    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik, num = 0;
        double total = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        mat = input.nextInt();


        System.out.print("Türkçe notunuz : ");
        turkce = input.nextInt();

        System.out.print("Fizik notunuz : ");
        fizik = input.nextInt();

        System.out.print("Kimya notunuz : ");
        kimya = input.nextInt();

        System.out.print("Müzik notunuz : ");
        muzik = input.nextInt();

        if (mat >= 0 && mat <= 100){
            total += mat;
            num++;
        }
        if (fizik >= 0 && fizik <= 100) {
            total += fizik;
            num++;
        }
        if (turkce >= 0 && turkce <= 100) {
            total += turkce;
            num++;
        }
        if (kimya >= 0 && kimya <= 100) {
            total += kimya;
            num++;
        }
        if (muzik >= 0 && muzik <= 100) {
            total += muzik;
            num++;
        }

        double average = total / num;

        if(average <= 55){
            System.out.println("Sınıfta kaldınız! Seneye tekrar görüşmek üzere!");
        }else {
            System.out.println("Tebrikler, sınıfı geçtiniz !");
        }
        System.out.println("Ortalamanız : " + average);
    }
}
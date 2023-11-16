import java.util.Scanner;

public class KullaniciGirisi {

    public static void main(String[] args) {
        String userName, password;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        userName = input.nextLine();

        System.out.print("Şifreniz : ");
        password = input.nextLine();

        String newPassword;

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yaptınız !");
        } else {
            System.out.println("Bilgileriniz Yanlış !");
            System.out.print("Şifrenizi sıfırlamak ister misiniz? (Evet/Hayır): ");
            String resetChoice = input.nextLine();

            if (resetChoice.equalsIgnoreCase("Evet")) {
                System.out.print("Yeni Şifrenizi Giriniz: ");
                newPassword = input.nextLine();

                if (!newPassword.equals(password)) {
                    System.out.println("Şifre oluşturuldu!");
                } else {
                    System.out.println("Şifre oluşturulamadı! Lütfen başka şifre giriniz.");
                    System.out.print("Yeni Şifrenizi Giriniz: ");
                    newPassword = input.nextLine();
                    System.out.println("Şifre oluşturuldu!");
                }
            } else {
                System.out.println("Şifre sıfırlama işlemi iptal edildi.");
            }
        }
    }
}

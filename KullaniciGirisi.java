import java.sql.SQLOutput;
import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {

        String username, password, select;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Kullanıcı Adınızı Giriniz: ");
        username = input.nextLine();

        System.out.print("Lütfen Şifrenizi Giriniz:");
        password = input.nextLine();

        if (username.equals("Patika") && password.equals("Java.123")) {
            System.out.println("Giriş Başarılı.");
        } else if (!(username.equals("Patika")) && !(password.equals("Java.123"))) {
            System.out.println("Kullanıcı adı ve/veya şifreniz yanlış. Lütfen tekrar deneyiniz.");
        } else if (!(username.equals("Patika")) && password.equals("Java.123")) {
            System.out.println("Kullanıcı adı ve/veya şifreniz yanlış. Lütfen tekrar deneyiniz.");
        } else if ((username.equals("Patika")) && !(password.equals("Java.123"))) {
            System.out.println("Kullanıcı adı ve/veya şifreniz yanlış. Lütfen tekrar deneyiniz.");
            System.out.println("Şifrenizi sıfırlamak ister misiniz?");
            System.out.print("Seçiminiz: ");
            select = input.nextLine();


            if (select.equals("Y") || select.equals("y")) {
                System.out.print("Yeni Şifrenizi Giriniz:");
                password = input.nextLine();
                System.out.print("Yeni Şifrenizi Tekrar Giriniz:");
                password = input.nextLine();
            }

            if (password.equals("Java.123")) {
                System.out.println("Yeni Şifreniz Eski Şifrenizle Aynı Olamaz. Tekrar Deneyiniz.");
                System.out.print("Yeni Şifrenizi Giriniz:");
                password = input.nextLine();
                System.out.print("Yeni Şifrenizi Tekrar Giriniz:");
                password = input.nextLine();

                if (!(password.equals("Java.123"))) {
                    System.out.println("Şifreniz Başarı İle Değiştirildi. Lütfen Şifrenizi Unutmayınız.");

                }

            }

            if (select.equals("N") || select.equals("n")) {
                System.out.println("Anasayfaya Yönlendiriliyorsunuz.");
            }
        }

    }


}

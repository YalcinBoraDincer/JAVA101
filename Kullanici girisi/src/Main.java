import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String username, password, Passnew;
        int cevap;
        Scanner inp = new Scanner(System.in);

        System.out.println("Kullanici adiniz : ");
        username = inp.nextLine();

        System.out.println("Sifreniz  : ");
        password = inp.nextLine();

        if (username.equals("patika") && password.equals("java123")) {
            System.out.println("Giris basarili");
        } else {
            System.out.println("Bilgileriniz hatali ");
            System.out.println("Sifrenizi degistirmek istiyor musunuz ? istiyorsaniz 1'e istemiyorsaniz  2 ye basin ");
        }
        cevap = inp.nextInt();
        switch (cevap) {
            case 1:
                System.out.println("Yeni sifrenizi giriniz : ");
                Scanner inp2 = new Scanner(System.in);
                Passnew = inp2.nextLine();
                if (Passnew.equals("java123")) {
                    System.out.println("Sifre olustrulamadi.Yeniden deneyin");


                } else {
                    System.out.println("Sifre degistirme basarili: ");
                    password = Passnew;
                }
                break;
            case 2:
                System.out.println("Tekrar deneyebilirsiniz : ");


        }
    }
}
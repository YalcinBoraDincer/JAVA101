import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String username, password;
        int right = 3;
        int balance = 1500;
        int selection;
        int price;

        while (right > 0) {
            System.out.println("Lutfen Kullanici Adinizi Giriniz : ");
            username = inp.nextLine();
            System.out.println("Sifrenizi Giriniz : ");
            password = inp.nextLine();

            if (username.equals("Bora") && password.equals("123321")) {
                System.out.println("Banka Boraya Hosgeldiniz :");
                do {
                    System.out.println("Lutfen yapmak istedeiginiz islemi secin : ");
                    System.out.println("""
                            1= Para Yatirma\s
                            2=Para cekme\s
                            3=Bakiye Sorgulama
                            4=Cikis Yap\s""");
                    selection = inp.nextInt();

                    switch (selection) {
                        case 1:
                            System.out.println("Para Miktari :");
                            price = inp.nextInt();
                            balance += price;
                            System.out.println("Yeni Bakiyeniz : " + balance);
                        case 2:
                            System.out.println("Cekmek Istediginiz para miktari : ");
                            price = inp.nextInt();
                            if (price <= balance) {
                                balance -= price;
                                System.out.println("Islem basarili Kalan Bakiyeniz : " + balance);
                            } else {
                                System.out.println("Cekmek istediginiz miktarda paraniz bulunmamaktadir kredi icin bankayamiza basvurabilirsiniz .");
                            }

                        case 3:
                            System.out.println("Mevcut Bakiyeniz :" + balance);


                    }

                } while (selection != 4);
                System.out.println("Tekrar Gorusmak Uzere ");

                break;
            } else {
                right--;
                if (right == 0) {
                    System.out.println("Hesabiniz Bloke Olmustur Lutfen Banka Ile Iletisime Geciniz ");
                } else
                    System.out.println("Kullanici Adiniz veya  Sifreniz Hatali ");
                System.out.println("Tekrar deneyiniz kalan hak : " + right);
            }


        }


    }
}

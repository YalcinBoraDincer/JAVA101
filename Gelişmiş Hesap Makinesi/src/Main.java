import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int select;
        String menu = "1-Toplama Islemi\n" +
                "2-Cikarma islemi\n" +
                "3=Carpma Islemi\n" +
                "4=Bolme Islemi\n" +
                "5-Uslu sayi hesaplama\n" +
                "6-Faktoriyel Hesaplama]\n" +
                "7-Diktortgen Alan ve Cevre Hesaplama\n" +
                "8-Mod alma islemi\n" +
                "0-Cikis yap";
        do {
            System.out.println(menu);
            System.out.print("Lutfen Bir Islem Seciniz :");
            select = inp.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    rectangle();
                    break;
                case 8:
                    mod();
                    break;

                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");

            }
        } while (select != 0);
    }

    static void plus() {
        Scanner inp = new Scanner(System.in);
        int number, number2;
        System.out.println("Birinci degeri yazin : ");
        number = inp.nextInt();
        System.out.println("Ikinci degeri yazin : ");
        number2 = inp.nextInt();

        int result = (number + number2);
        System.out.println("Toplama isleminin snucu : " + result);


    }

    static void minus() {
        Scanner inp = new Scanner(System.in);
        int number, number2;
        System.out.println("Birinci degeri yazin : ");
        number = inp.nextInt();
        System.out.println("Ikinci degeri yazin : ");
        number2 = inp.nextInt();

        int result = (number - number2);
        System.out.println("Cikarma isleminin snucu : " + result);
    }

    static void times() {
        Scanner inp = new Scanner(System.in);
        int number, number2;
        System.out.println("Birinci degeri yazin : ");
        number = inp.nextInt();
        System.out.println("Ikinci degeri yazin : ");
        number2 = inp.nextInt();

        int result = (number * number2);
        System.out.println("Carpma isleminin snucu : " + result);
    }

    static void divided() {
        Scanner inp = new Scanner(System.in);
        double number, number2;
        System.out.println("Payi yazin : ");
        number = inp.nextDouble();
        System.out.println("Paydayi degeri yazin : ");
        number2 = inp.nextDouble();

        double result = (number / number2);
        if (number2 == 0) {
            System.out.println("Hatali sayi yazdiniz payda 0 olamaz tekrar deneyiniz !");
        } else {
            System.out.println("Bolme isleminin snucu : " + result);
        }


    }
    static void power(){
        Scanner inp = new Scanner(System.in);
        int taban, us,result=1;
        System.out.println("Tabani  yazin : ");
        taban = inp.nextInt();
        System.out.println("Ussu yazin : ");
        us = inp.nextInt();
        for (int i=1;i<=us;i++){
            result*=taban;

        }
        System.out.println(taban+" Ussu "+us+" isleminin sonucu : "+result);


    }
    static void factorial(){
        int result=1,num;
        Scanner inp=new Scanner(System.in);
        System.out.println("Kac faktoriyel istediginizi girin : ");
        num= inp.nextInt();

        for (int i=1;i<=num;i++){
            result*=i;

        }
        System.out.println(num+" Faktoriyel = "+result);

    }
    static void rectangle(){
        double num1,num2;
        Scanner inp=new Scanner(System.in);
        System.out.println("Kisa kenari girin : ");
        num1= inp.nextDouble();
        System.out.println("Uzun kenari girin : ");
        num2= inp.nextDouble();

        double area =num1*num2;
        double perimeter=(num1+num2)*2;

        System.out.println("Diktortgenin alani : "+area+" Diktortgenin cevresi : "+perimeter );




    }
    static void mod(){
        double num1,num2;
        Scanner inp=new Scanner(System.in);
        System.out.println("Modu alinacak sayiyi girin : ");
        num1= inp.nextDouble();
        System.out.println("Modu  girin : ");
        num2= inp.nextDouble();

        double result=num1%num2;
        System.out.println(result);


    }


}


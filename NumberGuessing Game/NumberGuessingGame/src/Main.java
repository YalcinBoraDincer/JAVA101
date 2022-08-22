import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(30);

        int health = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;
        System.out.println(number);

        while (health < 5) {
            System.out.println("Lutfen sayi tahmininizi giriniz : ");
            selected = inp.nextInt();

            if (selected < 0 || selected > 30) {
                System.out.println("Lütfen 0-100 arasında bir değer giriniz.");
                if (isWrong) {
                    health++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak : " + (5 - health));
                } else {
                    isWrong = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                }
                continue;
            }
            if (selected == number) {
                System.out.println("Tebrikler Dogru Bildiniz !!");
                isWin = true;
                break;

            } else {
                if (selected > number) {
                    System.out.println("Tahmin ettiginiz sayi gizli sayidan buyuktur ");
                } else {
                    System.out.println("Tahmin ettiginiz sayi gizli sayidan kucuktur ");
                }

                wrong[health] = selected;
                health++;
                System.out.println("Kalan hakkiniz : " + (5 - health));


            }

        }
        if (!isWin) {
            System.out.println("Kaybettiniz ! ");
            if (!isWrong) {
                System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
            }


        }


    }
}


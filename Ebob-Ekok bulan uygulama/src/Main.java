import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("n1 sayisini giriniz");
        int n1 = inp.nextInt();
        System.out.println("n2 sayisini giriniz");
        int n2 = inp.nextInt();
        int ebob=1;
        int i = 1;
        while (i <= n1) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;

            }
            i++;
        }
        System.out.println("ebob :" + ebob);
        System.out.println("ekok :" + (n1 * n2) / ebob);
    }
}
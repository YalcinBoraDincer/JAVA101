import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int min = 0, max = 0;
        int n;
        System.out.println("Kac Sayi Gireceksiniz : ");
        int num = inp.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println("Lutfen " + i + ". numarayi girin :");
            n = inp.nextInt();
            if (i == 1) {
                max = n;
                min = n;
            } else {
                if (n > max) {
                    max = n;
                } else if (n < min) {
                    min = n;
                }
            }

        }
        System.out.println("En buyuk sayi : " + max);
        System.out.println("En kucuk sayi " + min);
    }
}

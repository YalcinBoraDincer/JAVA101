import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Sayi Girin ");
        int n = inp.nextInt();
        oruntu(n,0);


    }

    public static void oruntu(int n,int count) {
        System.out.print(n + " ");

        if (n >= 0) {
            count++;
            oruntu(n-5,count);}
        else {
            while (count>0){
                System.out.print((n+5)+" ");
                n+=5;
                count--;
            }return;
        }

        }
}









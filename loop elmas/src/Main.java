import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Satir Sayisini Giriniz : ");
        int satir= inp.nextInt();

        for (int i=1;i<=satir;i++){
            for (int j=i; j<satir;j++){
                System.out.print(" ");
            }for (int k=1;k<2*i;k++){
                System.out.print("*");

            }System.out.println();


        }for (int i=satir;i>=1;i--){
            for (int j=satir;j>i;j--){
                System.out.print(" ");
            }for (int k=1;k<2*i;k++){
                System.out.print("*");
            }System.out.println();

        }

    }
}

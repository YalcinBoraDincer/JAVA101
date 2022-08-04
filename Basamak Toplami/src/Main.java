import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        //Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
        //Örnek : 1643 = 1 + 6 + 4 + 3 = 14

        Scanner inp=new Scanner(System.in);
        System.out.println("Bir sayi giriniz : ");
        int num= inp.nextInt();

        int basSayisi=0;
        int basValue;
        int tempNumber=num;
        int total=0;



        while (tempNumber!=0){
            tempNumber/=10;
            basSayisi++;

        }tempNumber=num;
        while (tempNumber!=0){
            basValue=tempNumber%10;
            tempNumber/=10;
            total+=basValue;




        } System.out.println(total);




    }
}

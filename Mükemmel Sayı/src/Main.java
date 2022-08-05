import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int total=0;

        System.out.println("Bir Sayi Giriniz : ");
        int number= inp.nextInt();

        for (int i=1;i<number;i++){
            if (number%i==0){
                total+=i;
            }
        }
        if (number==total){
            System.out.println(number+" Sayisi bir mukemmel sayidir ! ");
        }else {
            System.out.println(number+" Sayisi bir mukemmel sayi degildir ! ");




        }



    }
}

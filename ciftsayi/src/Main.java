import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int k;

        Scanner inp=new Scanner(System.in);
        System.out.println("Sayi Giriniz : ");
        k= inp.nextInt();
        int count=0;
        int total=0;

        for (int i=0;i<=k;i++){
            if (i%3==0 && i%4==0 && i>0){
                count++;
                total+=i;
            }
        }
        double ave=total/count;
        System.out.println(ave);


    }
}
//Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.

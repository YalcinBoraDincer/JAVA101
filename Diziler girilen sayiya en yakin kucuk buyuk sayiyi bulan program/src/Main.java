import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Sayi giriniz : ");
        int num= inp.nextInt();

        int [] arr={15,12,788,1,-1,-778,2,0};
        Arrays.sort(arr);
        System.out.println("Dizinin Siralanmis hali : ");
        System.out.println(Arrays.toString(arr));


        for (int i=0;i< arr.length;i++){
            if (num<arr[i]){
                System.out.println("Girilen Sayi : "+num);
                System.out.println("Girilen sayidan kucuk en yakin sayi :  "+arr[i-1]);
                System.out.println("Girilen sayidan buyuk  en yakin sayi : "+arr[i]);
                break;



            }
        }


    }
}

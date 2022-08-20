import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        System.out.println("Dizinin Boyutunu giriniz : ");
        int size= inp.nextInt();

        int [] list=new int[size];
        System.out.println("Dizin elemannalrini giriniz : ");

        for (int i=0;i< list.length;i++){
            System.out.println((i+1)+".Eleman");
            list[i]= inp.nextInt();
        }

        System.out.println("Girilen dizi : "+Arrays.toString(list));
        Arrays.sort(list);
        System.out.println("Siralanan dizi : ");
        System.out.println(Arrays.toString(list));


    }

}


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    int num;
    int total=0;
    Scanner inp=new Scanner(System.in);
    do {
        System.out.println("Sayi giriniz :");
        num= inp.nextInt();
        if (num%4==0){
            total+=num;
        }
    }while (num%2==0);
        System.out.println(total);







        }
}



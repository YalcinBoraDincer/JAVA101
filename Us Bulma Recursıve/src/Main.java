import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Tabani Girin : ");
        int n= inp.nextInt();
        System.out.println("Ussu girin : ");
        int n2= inp.nextInt();
        System.out.println("Sonuc: "+exponentiation(n,n2));
        inp.close();



    }
     static int exponentiation(int n,int n2){
        if (n2==0){
            return 1;
        }else{
            return (n*(exponentiation(n,n2-1)));
        }



    }
}

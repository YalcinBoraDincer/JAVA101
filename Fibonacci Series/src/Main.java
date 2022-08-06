import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int elemanSayisi;

        int a=0,b=1;
        int c;
        Scanner inp=new Scanner(System.in);
        System.out.println("Eleman sayisini giriniz : ");
        elemanSayisi= inp.nextInt();

        for (int i=0;i<=elemanSayisi;i++){
            c=a+b;
            System.out.println(a+" + "+b+" = "+c);
            a=b;
            b=c;





            }
        }




    }

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a,b,c;
        Scanner inp=new Scanner(System.in);

        System.out.println("ucgenin ilk kenarini giriniz :  ");
        a= inp.nextInt();

        System.out.println("ucgenin ikinci kenarini giriniz :  ");
        b= inp.nextInt();

        System.out.println("ucgenin ucuncu  kenarini giriniz :  ");
        c= inp.nextInt();

       double cevre=a+b+c;
       double u=cevre/2;
        System.out.println("ucgenin cevresi : "+ cevre);

        double alanKare =u*(u-a)*(u-b)*(u-c);
        double alan=Math.sqrt(alanKare);
        System.out.println("Ucegnin alani : "+alan);












    }
}

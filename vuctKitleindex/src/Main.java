import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double boy;
        double kilo;
        Scanner inp=new Scanner(System.in);

        System.out.println("Lutfen boyunuzu giriniz : ");
        boy=inp.nextDouble();

        System.out.println("Lutfen Kilonuzu giriniz : ");
        kilo=inp.nextDouble();

        double kitleIndex= kilo/(boy*boy);
        System.out.println("Vucut kitle indexiniz : "+kitleIndex);
    }
}

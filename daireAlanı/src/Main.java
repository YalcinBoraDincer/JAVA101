import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double radius;
        double aci;
        double pi=3.14;


        Scanner inp=new Scanner(System.in);

        System.out.println("Yaricapi giriniz : ");
        radius= inp.nextDouble();

        System.out.println("Daire diliminin acisini giriniz : ");
        aci= inp.nextDouble();

        //Daire diliminin alani;

        double alan=(pi*(radius*radius)*aci)/360;
        System.out.println("Daire diliminin alani : "+alan);



    }
}

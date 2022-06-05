import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double girdi;
        Scanner inp =new Scanner(System.in);

        System.out.println("Kdv miktari istenen tutari girin ");
        girdi=inp.nextDouble();

        double oran1=0.18;
        double oran2=0.08;
        double lastPrice=(girdi*oran1)+girdi;
        double lastPrice2=(girdi*oran2)+girdi;

        if (girdi>=1000){
            System.out.println("Girdiginiz tutar : "+girdi);
            System.out.println("Kdv'li  tutar : "+lastPrice+" tl");
            System.out.println("Kdv tutari : %18 ");

        }else{

            System.out.println("Girdiginiz tutar : "+girdi);
            System.out.println("Kdv'li  tutar : "+lastPrice2+" tl");
            System.out.println("Kdv tutari : %8 ");

        }











    }
}

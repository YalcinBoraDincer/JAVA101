import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n1,n2,select;
        Scanner inp=new Scanner(System.in);

        System.out.println("ilk sayiyi giriniz ; ");
        n1= inp.nextInt();

        System.out.println("Ikinci sayiyi giriniz ; ");
        n2= inp.nextInt();

        System.out.println("Toplama icin 1 , Cikarma icin 2, Carpma icin 3, Bolme icin 4 'u secin ");
        select= inp.nextInt();

        switch (select){
            case 1:
                System.out.println("Sayilarin toplami = "+(n1+n2));
                System.out.println("Program bitti");
                break;
            case 2:
                System.out.println("Sayilarin Farki  = "+(n1-n2));
                System.out.println("Program bitti");
                break;
            case 3:
                System.out.println("Sayilarin carpimi = "+(n1*n2));
                System.out.println("Program bitti");
                break;
            case 4:
                if (n2==0){
                    System.out.println("Bir sayinin sifira bolumu tanimsizdir baska bir deger giriniz ");

                }else {
                    System.out.println("Sayilarin bolumu = "+(n1/n2));
                    System.out.println("Program bitti");
                    break;
                }
            default:
                System.out.println("Yanls secim yaptiniz verilen seceneklerden birini seciniz ");

        }

    }
}

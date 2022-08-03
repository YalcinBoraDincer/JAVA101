import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
        int num;

        Scanner inp=new Scanner(System.in);
        System.out.println("Sayi Giriniz : ");
        num= inp.nextInt();

        System.out.println("Dordun kuvvetleri : ");
        for (int i=1;i<=num;i*=4){
            System.out.println(i);
        }
        System.out.println("Besin Kuvvetleri : ");
        for (int j=1;j<num;j*=5){
            System.out.println(j);
        }











    }



}

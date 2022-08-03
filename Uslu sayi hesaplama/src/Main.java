import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.

        int num1,num2;
        int total=1;

        Scanner inp=new Scanner(System.in);
        System.out.println("Ussu alinacak sayiyi girin :");
        num1= inp.nextInt();
        System.out.println("Ussu giriniz : ");
        num2= inp.nextInt();

        for (int i=1;i<=num2;i++){
            total*=num2;
        }
        System.out.println("Cevap: "+total);


    }
}

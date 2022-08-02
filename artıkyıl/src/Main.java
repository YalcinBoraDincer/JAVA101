import java.time.Year;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);

        System.out.print("Lütfen bir yıl giriniz :");
        int yil = inp.nextInt();

        if(yil % 4 == 0 ){
            if(yil % 100 == 0){
                if(yil % 400 == 0){
                    System.out.println(yil + " yılı artık yıldır");
                }
                else{
                    System.out.println(yil + " yılı artık yıl değildir");
                }
            }
            else{
                System.out.println(yil + " yılı artık yıldır");
            }

        }

        else{
            System.out.println(yil + " yılı artık yıl değildir");
        }
    }

}
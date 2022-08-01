import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int mounth, day;

        Scanner inp = new Scanner(System.in);
        System.out.println("Dogdugunuz Ay");
        mounth = inp.nextInt();

        System.out.println("Dogdugunuz gun :");
        day = inp.nextInt();

        switch (mounth) {
            case 1:
                if (day >= 1 && day <= 31 ){
                    if(day < 22){
                        System.out.println("Burcunuz Oglak");
                    }else{
                        System.out.println("Burcunuz Kova");
                    }
                }else{
                    System.out.println("Hatali gun girdiniz ");
                }
                break;
            case 2:
                if (day >= 1 && day <= 31 ){
                    if(day < 22){
                        System.out.println("Burcunuz Kova");
                    }else{
                        System.out.println("Burcunuz Balik");
                    }
                }else{
                    System.out.println("Hatai gun girdiniz ");
                }
                break;
            case 3:
                if (day >= 1 && day <= 31 ){
                    if(day < 22){
                        System.out.println("Burcunuz Balik");
                    }else{
                        System.out.println("Burcunuz Koc");
                    }
                }else{
                    System.out.println("Hatali gun girdiniz ");
                }
                break;
            case 4:
                if (day >= 1 && day <= 31 ){
                    if(day < 22){
                        System.out.println("Burcunuz Koc");
                    }else{
                        System.out.println("Burcunuz Boga");
                    }
                }else{
                    System.out.println("Hatali gun girdiniz ");
                }
                break;
            case 5:
                if (day >= 1 && day <= 31 ){
                    if(day < 22){
                        System.out.println("Burcunuz Boga");
                    }else{
                        System.out.println("Burcunuz ikizler");
                    }
                }else{
                    System.out.println("Hatali gun girdiniz ");
                }
                break;
            case 6:
                if (day >= 1 && day <= 31 ){
                    if(day < 22){
                        System.out.println("Burcunuz ikizler");
                    }else{
                        System.out.println("Burcunuz yengec");
                    }
                }else{
                    System.out.println("Hatali gun girdiniz ");
                }
                break;
            case 7:
                if (day >= 1 && day <= 31 ){
                    if(day < 22){
                        System.out.println("Burcunuz Yengec");
                    }else{
                        System.out.println("Burcunuz Aslan");
                    }
                }else{
                    System.out.println("Hatali gun girdiniz ");
                }
                break;
            case 8:
                if (day >= 1 && day <= 31 ){
                    if(day < 22){
                        System.out.println("Burcunuz Aslan");
                    }else{
                        System.out.println("Burcunuz Basak");
                    }
                }else{
                    System.out.println("Hatali gun girdiniz ");
                }
                break;
            case 9:
                if (day >= 1 && day <= 31 ){
                    if(day < 22){
                        System.out.println("Burcunuz Basak");
                    }else{
                        System.out.println("Burcunuz Terazi");
                    }
                }else{
                    System.out.println("Hatali gun girdiniz ");
                }
                break;
            case 10:
                if (day >= 1 && day <= 31 ){
                    if(day < 22){
                        System.out.println("Burcunuz Terazi");
                    }else{
                        System.out.println("Burcunuz Akrep");
                    }
                }else{
                    System.out.println("Hatali gun girdiniz ");
                }
                break;
            case 11:
                if (day >= 1 && day <= 31 ){
                    if(day < 22){
                        System.out.println("Burcunuz Akrep");
                    }else{
                        System.out.println("Burcunuz Yay");
                    }
                }else{
                    System.out.println("Hatali gun girdiniz ");
                }
                break;
            case 12:
                if (day >= 1 && day <= 31 ){
                    if(day < 22){
                        System.out.println("Burcunuz Yay");
                    }else{
                        System.out.println("Burcunuz Oglak");
                    }
                }else{
                    System.out.println("Hatali gun girdiniz ");
                }
                break;
        }
    }
}

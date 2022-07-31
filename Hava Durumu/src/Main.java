import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int heat;
        Scanner ınp=new Scanner(System.in);
        System.out.println("Hava sicakligini 5 dereceden kucukse 1, 5 ile 25 arasinda ise ve 15 den kucuk ise 2 buyuk ise 3,25 den buyuk ise 4 tuslayin : ");
        heat= ınp.nextInt();

        switch (heat){
            case 1:
                System.out.println("Bugun Hava Kayak icin cok guzel");
                break;
            case 2:
                System.out.println("Sinemaya ne dersin ? ");
                break;
            case 3:
                System.out.println("Piknik de fena olmaz mi ? ");
                break;
            case 4:
                System.out.println("Sen en iyisi yuzmeye git ");
                break;
            default:
                System.out.println("Hatali giris ");








    }
}
}

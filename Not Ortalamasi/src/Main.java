import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;
        Scanner inp=new Scanner(System.in);

        System.out.println("Lutfen matematik notunu giriniz : ");
        mat=inp.nextInt();

        System.out.println("Lutfen fizik notunu giriniz : ");
        fizik=inp.nextInt();

        System.out.println("Lutfen kimya notunu giriniz : ");
        kimya=inp.nextInt();

        System.out.println("Lutfen turkce notunu giriniz : ");
        turkce=inp.nextInt();

        System.out.println("Lutfen tarih notunu giriniz : ");
        tarih=inp.nextInt();

        System.out.println("Lutfen muzik notunu giriniz : ");
        muzik=inp.nextInt();

        int total=(mat+fizik+kimya+turkce+tarih+muzik);
        double ave=total/6;


        boolean control=ave>60;
        System.out.println("Notlarinizin ortalamasi : "+ave);
        System.out.println(ave>=60 ? "Tebrikler Gectiniz ":"Malesef kaldiniz ");





    }
}

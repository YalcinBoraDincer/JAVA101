import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Double mat,fizik,turkce,kimya,muzik;

        Scanner inp1=new Scanner(System.in);
        System.out.println("Lutfen Matematik notunnuzu giriniz");
        mat=inp1.nextDouble();


        Scanner inp2=new Scanner(System.in);
        System.out.println("Lutfen fizik notunnuzu giriniz");
        fizik=inp2.nextDouble();


        Scanner inp3=new Scanner(System.in);
        System.out.println("Lutfen turkce notunnuzu giriniz");
        turkce=inp3.nextDouble();


        Scanner inp4=new Scanner(System.in);
        System.out.println("Lutfen kimya notunnuzu giriniz");
        kimya=inp4.nextDouble();


        Scanner inp5=new Scanner(System.in);
        System.out.println("Lutfen Muzik notunnuzu giriniz");
        muzik=inp5.nextDouble();

        if (mat<0 || mat>100){
            mat=0.0;
        }
        if (fizik<0 || fizik>100){
            fizik=0.0;
        }if (turkce<0 || turkce>100){
            turkce=0.0;
        }if (kimya<0 || kimya>100){
            kimya=0.0;
        }if (muzik<0 || muzik>100){
            muzik=0.0;
        }
        double ave=(mat+fizik+turkce+kimya+muzik)/5;


        if (ave>=55){
            System.out.println("Tebrikler Ortalamaniz :"+ave+"  Gectiniz !!");
        }
        else {
            System.out.println("Ortalamaniz "+ave+"  Oldugu icin kaldiniz !!");
        }










    }
}

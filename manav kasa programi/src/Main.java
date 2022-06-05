import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double elma_kg,patlican_kg,armut_kg,domates_kg,muz_kg;
        Scanner inp=new Scanner(System.in);

        System.out.println("kac kg elma aldin ? : ");
        elma_kg=inp.nextDouble();

        System.out.println("kac kg patlican aldin ? : ");
        patlican_kg=inp.nextDouble();

        System.out.println("kac kg armut aldin ? : ");
        armut_kg=inp.nextDouble();

        System.out.println("kac kg domates aldin ? : ");
        domates_kg=inp.nextDouble();

        System.out.println("kac kg muz aldin ? : ");
        muz_kg=inp.nextDouble();

        double total=(elma_kg*=3.67)+(patlican_kg*5.00)+(armut_kg*2.14)+(domates_kg*1.11)+(muz_kg*0.95);
        System.out.println("Toplam "+total+"  tl tuttu");



    }
}

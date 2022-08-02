import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
        // Mesafe başına ücret 0,10 TL / km olarak alın.
        //İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;
        //Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
        //Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        //Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
        //Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
        //Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.

        int km,yas,yoltip;

        Scanner inp=new Scanner(System.in);

        System.out.println("Mesafeyi km cinsinden giriniz : ");
        km=inp.nextInt();

        System.out.println("Yasinizi giriniz : ");
        yas= inp.nextInt();

        System.out.println("Tek yon icin 1 cift yon icin 2 giriniz ");
        yoltip= inp.nextInt();

        double bilet=(km*0.1);
        double ciftbilet=(km*0.1*2)-(km*0.1*2*0.2);
        if (km<0){
            System.out.println("Hatali Veri Girdiniz");
        }

        switch (yoltip){
            case 1:
                if (yas<12) {
                    bilet=(bilet-(bilet*0.5));
                    System.out.println(bilet);

                }else if (yas>=12 && yas<24){
                    bilet=(bilet-(bilet*0.1));
                    System.out.println(bilet);

                }else if (yas>65 && yas<140){
                    bilet=(bilet-(bilet*0.3));
                    System.out.println(bilet);
                }else if (yas<0 || yas >140){
                    System.out.println("Hatali Yas Girdiniz");
                }else{
                    System.out.println(bilet);
                    break;
                }
            case 2:
                if (yas<12) {
                    ciftbilet=(ciftbilet-(ciftbilet*0.5));
                    System.out.println(ciftbilet);

                }else if (yas>=12 && yas<24){
                    ciftbilet=(ciftbilet-(ciftbilet*0.1));
                    System.out.println(ciftbilet);

                }else if (yas>65 && yas<140){
                    ciftbilet=(ciftbilet-(ciftbilet*0.3));
                    System.out.println(ciftbilet);
                }else {
                    System.out.println("Hatali yas girdiniz ");

                break;















        }













    }
    }
}




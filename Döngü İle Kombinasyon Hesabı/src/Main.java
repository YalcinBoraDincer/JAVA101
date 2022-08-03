import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n,r;

        int nfac=1;
        int rfac=1;
        int yfAC=1;
        int formula;
        System.out.println("N degerini girin :");
        n= inp.nextInt();
        System.out.println("R degerini girin : ");
        r= inp.nextInt();

        int y=n-r;

        if (n>r){
            for (int i=1;i<=n;i++){
                nfac*=i;
            }
            for (int j=1;j<=r;j++){
                rfac*=j;
            }
            for (int k=1;k<=y;k++){
                yfAC*=k;
            }
            formula=nfac/(rfac*yfAC);
            System.out.println("C(n,r) :"+formula);
        }else {
            System.out.println("N degeri r den buuyuk olamaz");
        }



    }
}//Kombinasyon formülü
    //C(n,r) = n! / (r! * (n-r)!)

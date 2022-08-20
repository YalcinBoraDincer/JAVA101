import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int [] dizi={10, 20, 20, 10, 10, 20, 5, 20};
        Arrays.sort(dizi);
        int n;
        for (int i=0;i< dizi.length;i++){
            n=1;
            for (int k=0;k< dizi.length;k++){
                if (i!=k && dizi[i]==dizi[k]){
                    n++;
                }
            }
            if (i== dizi.length-1 || dizi[i]!=dizi[i+1]){
                System.out.println(dizi[i]+".Eleman "+n+" kez tekrar ediyor ");
            }

        }





    }
}

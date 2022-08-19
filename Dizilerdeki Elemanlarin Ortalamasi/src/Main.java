public class Main {

    public static void main(String[] args) {

        int [] list={21,32,43,54,87,45,32,12,31};
        double sum=0.0;

        for (int i=0;i<list.length;i++){
            sum+=list[i];
        }

        double ave=sum/ list.length;
        System.out.println(ave);





    }
}

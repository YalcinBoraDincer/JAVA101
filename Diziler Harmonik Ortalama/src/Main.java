public class Main {

    public static void main(String[] args) {
      double sum=0.0;
      double[] list={1,4,5,6,7,12,32,13,44};

      for (double i:list){
          sum+=1/i;
      }
      double ave=list.length/sum;

        System.out.println("Bu dizinin harmonik ortalamasi : "+ave);






    }
}

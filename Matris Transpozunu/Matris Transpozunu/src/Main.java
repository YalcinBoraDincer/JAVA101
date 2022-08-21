public class Main {


    public static int [][]trnasposeMatrix(int [][] matrix){
        int [][] transPose=new int[matrix[0].length][matrix.length];
        for (int i=0;i< matrix.length;i++){
            for (int j=0;j< matrix[i].length;j++){
                transPose[j][i]=matrix[i][j];
            }
        }return transPose;

    }

    public static void printMatrix(int [][] matrix){
        for (int i=0;i< matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+ "\t");
            }
            System.out.println();
        }
        

    }
    public static void main(String[] args) {

        int matrix[][]={{2,3,4},{5,6,4}};
        System.out.println("Matirs : ");
        printMatrix(matrix);
        System.out.println("Transpose : ");
        printMatrix(trnasposeMatrix(matrix));



    }
}
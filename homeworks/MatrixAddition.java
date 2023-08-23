package Odevler;

public class MatrixAddition {
    public static void main(String[] args) {
        int[][] matrix=new int[5][5];
        int addition=0;
        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){

               int random= (int)(Math.random()*10);
               matrix[i][j]=random;
                System.out.print(matrix[i][j]+ " ");
            }
            addition+=matrix[i][i];
            System.out.println();
        }
        System.out.println("sum of the corners of the matrix: " +addition);

    }
}

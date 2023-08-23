package Odevler;

import java.util.Scanner;

public class DrawXwithx {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter number of rows: ");
        int row=input.nextInt();
        int[][] drawX=new int[row][row];
        for(int i=0;i<row;i++){
            for (int j=0;j<row;j++){
                if(i+j==row-1 || i==j){
                    System.out.print("x");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }
}

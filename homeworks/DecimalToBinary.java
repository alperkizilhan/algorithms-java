package Odevler;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number you want to convert to binary");
        int num= input.nextInt();
        String binary="";
        int decimal=num;

        while(num>0){
             int remainder=num%2;
             binary= remainder + binary;
             num=num/2;

        }
        System.out.println("Binary equivalent of "+decimal +" is: "+binary );

    }
}

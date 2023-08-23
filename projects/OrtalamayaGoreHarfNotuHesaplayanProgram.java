package projects;

import java.util.Scanner;

public class OrtalamayaGoreHarfNotuHesaplayanProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen notunuzu girin: ");
        int ortlama = input.nextInt();
        if (ortlama >= 85) {
            System.out.println("AA");
        } else if (ortlama >= 75) {
            System.out.println("BA");
        } else if (ortlama >= 65) {
            System.out.println("BB");
        } else if (ortlama >= 57) {
            System.out.println("CB");
        } else if (ortlama >= 50) {
            System.out.println("CC");
        }else{
            System.out.println("KALDINIZ");
        }
    }
}

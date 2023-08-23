package Odevler;

import java.util.Scanner;

public class Bolum6Soru4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen 1. sayıyı girin: ");
        int sayi1= input.nextInt();
        System.out.println("Lütfen 2. sayıyı girin: ");
        int sayi2=input.nextInt();

        ekokBul(sayi1,sayi2);
        ebobBul(sayi1,sayi2);

    }

    private static void ebobBul(int sayi1, int sayi2) {
        int ebob=0;
        for(int i=1;i<sayi1;i++){
            if(sayi1%i==0&&sayi2%i==0){
                ebob=i;
            }
        }
        System.out.println(sayi1 +" ve "+sayi2 +" sayılarının Ebobu: "+ebob);
    }

    private static void ekokBul(int sayi1, int sayi2) {
        int max= sayi1*sayi2;
        int ekok=0;
        for(int i=max;i>0;i--){
            if(i%sayi1==0&&i%sayi2==0){
                ekok=i;
            }
        }
        System.out.println(sayi1 +" ve "+sayi2 +" sayılarının Ekoku: "+ekok);
    }
}

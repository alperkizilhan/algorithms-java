package projects;

import java.util.Scanner;

public class EbobBulanProgram {
    public static void main(String[] args) {
        Scanner tara= new Scanner(System.in);
        System.out.println("1. sayıyı girin");
        int sayi1= tara.nextInt();
        System.out.println("2. sayıyı girin");
        int sayi2= tara.nextInt();

        int ebob = 1;
        int kontrol = 2;

        while(kontrol <= sayi1 && kontrol <= sayi2) {
            if (sayi1 % kontrol == 0 && sayi2 % kontrol == 0) {
                ebob = kontrol;
            }
            kontrol++;
        }
        if(ebob==1){
            System.out.println(sayi1 + " ve " +sayi2 + " Aralarında Asaldır.");
        }else{
            System.out.println(sayi1 + " ve " +sayi2 + " sayılarının ebobu = " +ebob);
        }

    }
}

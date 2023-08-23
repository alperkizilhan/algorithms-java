package projects;

import java.util.Scanner;

public class FaktoriyelHesaplayanProgram {
    public static void main(String[] args) {

        Scanner tara= new Scanner(System.in);
        System.out.println("Lütfen Faktöriyelini Hesaplamak İstediğiniz Sayıyı Girin: ");
        int sayi= tara.nextInt();
        int faktoriyel=1;
        for(int i= 1; i<=sayi; i++){
            faktoriyel= faktoriyel*i;
        }
        System.out.println(faktoriyel);
    }
}

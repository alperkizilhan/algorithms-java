package projects;

import java.util.Scanner;

public class GirilenSayilarinCarpimlariniBulanProgram {
    public static void main(String[] args) {
        Scanner tara= new Scanner(System.in);
        System.out.println("Bir değer Giriniz");
        int girilendeger= tara.nextInt();
        int sonuc=1;

        while (girilendeger!=0){
            sonuc=sonuc*girilendeger;
            System.out.println("Bir değer Giriniz");
            girilendeger= tara.nextInt();
        }
        System.out.println(sonuc);
    }
}

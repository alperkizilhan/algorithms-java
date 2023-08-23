package projects;

import java.util.Scanner;

public class BasitDenklemHesaplayanProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen x değerini girin: ");
        int x= input.nextInt();
        System.out.println("Lütfen y değerini girin: ");
        int y= input.nextInt();
        int sonuc=0;
        if (x>0 & y<0){
            sonuc= 4*x + 2*y + 4;
        }else if(x>0 & y==0){
            sonuc= 2*x - y + 3;
        }else if (x<0& y>0){
            sonuc= 3*x+4*y+3;
        }
        System.out.println(sonuc);
    }
}

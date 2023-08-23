package projects;

import java.util.Scanner;

public class GirilenSayiyaKadarOlanAsalSayilariBulanProgram {
    public static void main(String[] args) {
        Scanner tara= new Scanner(System.in);
        System.out.println("Bir sayı girin");
        int sayi=tara.nextInt();

        for(int i=2;i<=sayi;i++){
            boolean asal=true;
            for (int j=2;j<i;j++){
                if (i%j==0){
                    asal=false;
                    break;
                }
            }
            if (asal==true){
                System.out.println(i);
            }
        }

    }
}

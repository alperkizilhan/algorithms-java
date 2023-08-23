package projects;

import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {

        Scanner tara= new Scanner(System.in);
        Random random= new Random();
        int sayi = random.nextInt(100);
        System.out.println(sayi);
        int tahmin=0;
        while(tahmin!=sayi){
            System.out.println("Tahmininizi Girin");
            tahmin=tara.nextInt();
            if(sayi>tahmin){
                System.out.println("Yukarı");
            }else if (sayi<tahmin){
                System.out.println("Aşağı");
            }else{
                System.out.println("Tahmininiz Doğru");
            }
        }
    }
}

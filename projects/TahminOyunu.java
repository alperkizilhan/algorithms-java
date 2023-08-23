package projects;

import java.util.Scanner;

public class TahminOyunu {

    public static void main(String[] args) {
        {
            Scanner tara = new Scanner(System.in);
            int sayi = (int)(Math.random()*100);

            if (sayi<10){
                sayi = (int)(Math.random()*100);
            }

            System.out.println(sayi);
            int tahmin;
            int sayiOnlarBasamagı= sayi/10;
            int sayiBirlerBasamagi=sayi %10;
            System.out.println("Lütfen Tahmininizi Girin");
            tahmin= tara.nextInt();
            int tahminOnlarBasamagı= tahmin/10;
            int tahminBirlerBasamagi=tahmin %10;
            if(sayi==tahmin){
                System.out.println("Tebrikler 10000 Tl Kazandınız.Şanslı sayıyı bildiniz. Sayı= " +sayi +"tahmininiz= " +tahmin );
            }else if(tahminBirlerBasamagi==sayiOnlarBasamagı || tahminBirlerBasamagi == sayiBirlerBasamagi || tahminOnlarBasamagı==sayiOnlarBasamagı||tahminOnlarBasamagı==sayiBirlerBasamagi){
                System.out.println("Tebrikler 1000 TL KAZANDINIZ.Şanslı sayının rakamlarını bildiniz. Sayı= "+sayi +"tahmininiz= " +tahmin);
            }else if(tahminBirlerBasamagi==sayiOnlarBasamagı && tahminOnlarBasamagı==sayiBirlerBasamagi){
                System.out.println("Tebrikler 5000TL KAZANDINIZ.Şanslı sayının rakamlarından birini bildiniz. Sayı= "+sayi +"tahmininiz= " +tahmin);
            }else{
                System.out.println("ÖDÜL KAZANAMADINIZ. Maaalesef tahmininiz yanlış. Sayı= "+sayi +"tahmininiz= " +tahmin);
            }

        }
    }
}

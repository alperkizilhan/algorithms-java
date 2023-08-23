package projects;
import java.util.Scanner;

// Klavyeden girilen 3 sayının ortalamasını alan program
public class GirilenUcSayininOrtalamasi {

    public class Main {

        public static void main(String[] args) {
            Scanner tara = new Scanner(System.in);
            System.out.println("Lütfen 1.Sayıyı Giriniz= ");
            int sayi1 = tara.nextInt();
            System.out.println("Lütfen 2. Sayıyı Giriniz= ");
            int sayi2 = tara.nextInt();
            System.out.println("Lütfen 3. Sayı Giriniz= ");
            int sayi3 = tara.nextInt();

            double ortalama= (double) (sayi1+sayi2+sayi3)/3;
            System.out.println("Girdiğiniz "+sayi1 +" "+sayi2+" " +sayi3+" sayılarının ortalamaları= " +ortalama);

        }
    }

}

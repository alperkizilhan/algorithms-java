package projects;

import java.util.Scanner;

public class OrtalamaHesaplamakİstediginizSayiAdedineGoreOrtalamaHesaplayanProgram {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Kaç Sayının Ortalamasını Hesaplamak İstiyorsunuz");
        int ortalamasiAlinacakSayiAdedi= input.nextInt();
        int [] ortalamasiAlinacakSayilar= new int[ortalamasiAlinacakSayiAdedi];
        int toplam=0;
        for (int i=0;i<ortalamasiAlinacakSayilar.length;i++){
            System.out.println(i+1 +". Sayıyı Girin");
            ortalamasiAlinacakSayilar[i] = input.nextInt();
            toplam= toplam + ortalamasiAlinacakSayilar[i];
        }
        System.out.println("Ortalamasını Hesaplamak İstediğiniz Sayılar");
        for (int j=0;j<ortalamasiAlinacakSayilar.length;j++){
            System.out.print(ortalamasiAlinacakSayilar[j]+" ");
        }
        double ortalama= (double) toplam/ortalamasiAlinacakSayilar.length;
        System.out.println(" Ortalama= " +ortalama);
    }
}

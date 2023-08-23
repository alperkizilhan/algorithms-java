package Odevler;

import java.util.Arrays;

public class Bolum7Soru2 {
    public static void main(String[] args) {
        Ogrenci tumOgrenciler[]= new Ogrenci[100];
        for (int i=0; i<tumOgrenciler.length;i++){
            int rastgeleID= (int)(Math.random()*5000);
            int rastgelenot= (int)(Math.random()*100);
            Ogrenci yeniOgrenci= new Ogrenci(rastgeleID,rastgelenot);
            tumOgrenciler[i]=yeniOgrenci;
        }
        for (int j=0;j< tumOgrenciler.length;j++){
            tumOgrenciler[j].ogrenciBilgileriniYazdir();
        }
        System.out.println("-------------------------");

        for (int j=0;j< tumOgrenciler.length;j++){
            tumOgrenciler[j].ogrenciBilgileriniYazdir();
        }
        

    }

}

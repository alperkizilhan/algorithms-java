package Algoritmalar;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int [] siralanacakDizi={1,2,3,4,5,6,7,8,9,10};

        System.out.println("Aranacak Elamanı Gir: ");
        Scanner input= new Scanner(System.in);
        int arananSayi= input.nextInt();

        int sonuc= binarySearchAlgorithm(siralanacakDizi,arananSayi);

        if (sonuc==-1){
            System.out.println("SAYI BULUNAMADI");
        }else{
            System.out.println("SAYI BULUNUDU INDEX: "+sonuc);
        }

    }

    private static int binarySearchAlgorithm(int[] siralanacakDizi, int arananSayi) {
        int altIndex=0;
        int ustIndex=siralanacakDizi.length-1;

        while (ustIndex>=altIndex){
            int ortaIndex=(ustIndex+altIndex)/2;
            if (arananSayi==siralanacakDizi[ortaIndex]){
                return ortaIndex;
            }else if(arananSayi< siralanacakDizi[ortaIndex]){
                ustIndex=ortaIndex-1;
            }else{
                altIndex=ortaIndex+1;
            }

        }
        return -1;
    }
}

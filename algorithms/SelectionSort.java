package Algoritmalar;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] siralanacakDizi={21,34,14,656,64,23,75,1,5,754,321,54,23,56,33,435,321,343,97,7,867,88,245,6};
        Arrays.sort(siralanacakDizi);

        for (int i=0;i<siralanacakDizi.length;i++){
            int enKucuk=siralanacakDizi[i];
            int enKucukIndex=i;
            for (int j=i+1;j<siralanacakDizi.length;j++){
                if(enKucuk>siralanacakDizi[j]){
                    enKucuk=siralanacakDizi[j];
                    enKucukIndex=j;
                }
            }
            if(enKucukIndex!=i){
                siralanacakDizi[enKucukIndex]=siralanacakDizi[i];
                siralanacakDizi[i]=enKucuk;
            }
        }
        System.out.println("SELECTİON SORT: ");
        for (int i=0;i<siralanacakDizi.length;i++){
            System.out.print(siralanacakDizi[i]+" ");

        }
    }
}

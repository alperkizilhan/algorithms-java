package Okul.DersteYazilanKodlar;

import java.util.Arrays;

public class Hafta4 {
    public static void main(String[] args) {
        // double[] scores
        //double scores[]

        //double scores[],average;//birden fazla nesne tanımlarken köşeli parantezi değişkenn isminin sonuna koyarız.
        //double scr[]= new double[-5]; // compiler bunu derler ama runtime da eror verir. dizi uzunluğu olarak int değer beklenir -5 te int değer olduğundan
        // kod derlenir fakat runtimeda bellek alanı ayrılmaya çalışırken -5 tane değer için bellek alanı ayırılamadığından runtime eror verir.

        //toString() metodu değeri stringe çevirir.


        // referans tipler için atama operatörü (dizi vs) referans variableın kopyasını gösterir.
       // int [] source={2,3,4};

      //  int[]target= Arrays.copyOf(source,source.length); // array copy

        // int [] nums= new int[5];


        /*
        1.

        int[] nums = {10,20,30,40};   // iki ayrı satırda dizi tanımı yapılamaz.
        nums[3]=50;

        System.out.println(Arrays.toString(nums));
         */

        int[] source={10,20,30,40};
        int []target= new int[source.length];
      //  target=source;
       // System.out.println(source.toString());
        //System.out.println(target.toString());

       // System.arraycopy(source,0,target,0,source.length);
        //System.out.println(source.toString());
        //System.out.println(target.toString());
        int []target1=Arrays.copyOf(source,source.length);
        System.out.println(Arrays.toString(target1));
        int []target2=Arrays.copyOfRange(source,0,3);
        System.out.println(Arrays.toString(target2));

        printArray(new int[]{10,20,30});




    }

    public static void printArray(int[] list){
        for(int element:list)
            System.out.print(element + " ");
    }

    // iki katlı dizi tanımlarken [3][] şeklinde tanımlama yapabiliriz. buna duzensiz array denir.
    //*******odev******
    //1. binary search recursive olarak yaz
    //2. selection sort yaz
    //3.matrix oluştur. multi dimensional şekilde

}

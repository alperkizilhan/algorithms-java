package Okul.DersteYazilanKodlar;

import java.util.Scanner;

public class BinaryOkul {
    public static void main(String[] args) {
        int [] list={2,3,11,17,18,24,33,35};

        System.out.println("Enter a key: ");
        Scanner input= new Scanner(System.in);
        int key= input.nextInt();



        int s=binarySearch(list,key);
        System.out.println(s);

    }

    public static int binarySearch(int[] list, int key) {
        int low=0;
        int high=list.length-1;

        while (high>=low){
            int mid=(low+high)/2;
            if (key > list[mid]) {
                low=mid+1;

            }else if(key==list[mid]){
                return mid;
            }else
                high=mid-1;

        }
        return -low-1;
    }

}

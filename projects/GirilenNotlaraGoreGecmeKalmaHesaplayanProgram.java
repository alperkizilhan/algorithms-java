package projects;

import java.util.Scanner;

public class GirilenNotlaraGoreGecmeKalmaHesaplayanProgram {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        System.out.println("Lütfen Vize notunuzu girin: ");
        int vizeNotu, finalNotu;
        vizeNotu = tara.nextInt();
        System.out.println("Final Notunuzu girin: ");
        finalNotu = tara.nextInt();
        double ortalama= (double) (vizeNotu*0.4) + (finalNotu*0.6);
        if (ortalama>=50){
            System.out.println("TEBRİKLER GEÇTİNİZ! ORT: "+ortalama );
        }else{
            System.out.println("MAALESEF KALDINIZ! ORT: "+ortalama);
        }
    }
}

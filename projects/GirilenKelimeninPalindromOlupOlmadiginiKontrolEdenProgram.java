package projects;

import java.util.Scanner;

public class GirilenKelimeninPalindromOlupOlmadiginiKontrolEdenProgram {
    public static void main(String[] args) {
        Scanner tara= new Scanner(System.in);
        System.out.println("Bir kelime girin");
        String girilenKelime=tara.nextLine();
        System.out.println(girilenKelime);
        boolean palindrom=true;

        int kelimeUzunluk=girilenKelime.length();

        for(int i=0; i<kelimeUzunluk; i++){
            if(girilenKelime.charAt(i)!=girilenKelime.charAt(kelimeUzunluk-1)){
                palindrom=false;
            }else{
                palindrom=true;
            }
            kelimeUzunluk--;
        }
        if(palindrom==true){
            System.out.println("gİridiğimiz kelime palındrom");
        }else{
            System.out.println("Palindrom değil");
        }
    }
}

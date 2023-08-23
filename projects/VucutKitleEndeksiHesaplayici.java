package projects;
import java.util.Scanner;


public class VucutKitleEndeksiHesaplayici {

    public class Main {

        public static void main(String[] args) {
            {
                Scanner tara = new Scanner(System.in);
                System.out.println("Vücut Kitle Endeksi Hesaplayıcına Hoş Geldiniz!");
                System.out.println("Lütfen Kilonuzu kg cinsinden Giriniz");
                double kilo = tara.nextDouble();
                System.out.println("Lütfen Boyunuzu cm cinsinden Giriniz");
                double boy = tara.nextDouble();
                double VucutKitleEndeksi = (kilo / ((boy/100)*(boy/100)));
                System.out.println("Vücut Kitle Endeksi = " + VucutKitleEndeksi);

                if(VucutKitleEndeksi < 15){
                    System.out.println("Çok ciddi derecede düşük kilolu");
                }else if(VucutKitleEndeksi > 15 && VucutKitleEndeksi <16){
                    System.out.println("Ciddi derecede düşük kilolu");
                }else if(VucutKitleEndeksi > 16 && VucutKitleEndeksi < 25){
                    System.out.println("Sağlıklı");
                }else if(VucutKitleEndeksi > 25 && VucutKitleEndeksi < 40){
                    System.out.println("Kilolu");
                }else {
                    System.out.println("Aşırı kilolu");
                }
            }
        }
    }

}

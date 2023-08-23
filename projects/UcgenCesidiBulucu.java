package projects;
import java.util.Scanner;

// Klavyeden kenarları girilen bir üçgenin çeşidini veren program.
public class UcgenCesidiBulucu {

    public class Main {

        public static void main(String[] args) {
            Scanner tara = new Scanner(System.in);
            int a,b,c;
            System.out.println("Lütfden Kenar Uzunluklarını Giriniz= ");
            a= tara.nextInt();
            b= tara.nextInt();
            c= tara.nextInt();

            if((Math.abs(a-b)<c && c<(a+b)) && (Math.abs(a-c)<b && b<(a+c)) && (Math.abs(c-b)<a && a<(c+b))  ){
                if (a==b && b==c && a==c){
                    System.out.println("Eşkenar Üçgen");
                }else if((a==b && c!=a) || (c==a && b!=a) || (b==c&& a!=b)){
                    System.out.println("İkizkenar Üçgen");
                }else{
                    System.out.println("Çeşitknar Üçgen");
                }
            }else {
                System.out.println("Girdiğiniz Değerler Bir Üçgen Oluşturmamaktadır. Lütfen Girdiğiniz Değerleri Kontrol Ediniz" );
            }
        }
    }

}

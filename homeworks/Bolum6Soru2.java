package Odevler;

public class Bolum6Soru2 {
    public static void main(String[] args) {
        int matris[][]=new int[3][2];
        int kucuk=11110;
        int buyuk=0;
        for (int i=0;i< matris.length;i++){
            for (int j=0;j< matris[i].length;j++){
                int rastgeleSayi=(int)(Math.random()*100);
                matris[i][j]=rastgeleSayi;
                System.out.print(matris[i][j]+" ");

                if(kucuk>rastgeleSayi){
                    kucuk=rastgeleSayi;
                }
                if(buyuk<rastgeleSayi){
                    buyuk=rastgeleSayi;
                }
            }
            System.out.println(" ");
        }
        System.out.println("kucuk: "+kucuk+" Buyuk: " +buyuk);
    }
}

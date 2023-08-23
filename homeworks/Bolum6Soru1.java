package Odevler;

public class Bolum6Soru1 {
    public static void main(String[] args) {
        int[] notlar= new int[100];
        int toplam=0;
        int kalanKisiSayisi=0;
        for (int i=0;i< notlar.length;i++){
            int rastegeleSayi=(int)(Math.random()*100+10);
            notlar[i]=rastegeleSayi;
            toplam+=notlar[i];
            if(notlar[i]<50){
                kalanKisiSayisi++;
            }
        }
        double ortalama=toplam/ notlar.length;
        System.out.println("SINIFTAKİ ÖĞRENCİLERİN ORT: "+ortalama +" Kalan Kişi Sayısı: "+kalanKisiSayisi);

    }
}

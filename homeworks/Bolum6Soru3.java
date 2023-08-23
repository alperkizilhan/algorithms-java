package Odevler;

public class Bolum6Soru3 {
    public static void main(String[] args) {
        String[] kartTurleri = {"KARO", "KUPA", "MAÇA", "SİNEK"};
        String[] kartNumaralari ={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};

        int deste[]=new int[52];

        desteyiOlustur(deste);
        desteyiKaristir(deste);
        desteyiGoster(deste, kartNumaralari, kartTurleri);

    }

    private static void desteyiKaristir(int[] deste) {
        for (int i=0;i< deste.length;i++){
            int rastgeleIndex=(int)(Math.random()* deste.length);
            int gecici=deste[i];
            deste[i]=deste[rastgeleIndex];
            deste[rastgeleIndex]=gecici;

        }

    }

    private static void desteyiGoster(int[] deste, String[] kartNumaralari, String[] kartTurleri) {
        for(int i=0;i<4;i++){
            String kartTuru = kartTurleri[deste[i] / 13];
            String kartNumarasi = kartNumaralari[deste[i] % 13];
            System.out.println(kartTuru + " " + kartNumarasi);
        }

    }

    private static void desteyiOlustur(int[] deste) {
        for(int i = 0; i<deste.length; i++){
            deste[i]=i;
        }

    }
}

package projects;

public class DiziElemanlariniRastgeleKaristirma {
    public static void main(String[] args) {
        int [] sayilar= {0,1,2,3,4,5,6,7,8,9};

        diziYazdır(sayilar);
        System.out.println("\n********************************\n");
        diziKaristirici(sayilar);
        diziYazdır(sayilar);

    }

    private static void diziKaristirici(int[] sayilar) {
        for (int j=sayilar.length-1;j>0;j--){

            int rastgeleIndex=(int)(Math.random()*(j+1));
            int gecici=sayilar[j];
            sayilar[j]=sayilar[rastgeleIndex];
            sayilar[rastgeleIndex]=gecici;
        }
    }

    private static void diziYazdır(int sayilar[]) {
        for (int i=0;i<sayilar.length;i++){
            System.out.println(sayilar[i]);
        }
    }
}

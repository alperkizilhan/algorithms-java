package projects;

public class CarpimTablosuProgrami {
    public static void main(String[] args) {
        int sonuc=0;
        for(int i=1; i<=10; i++){

            for(int j=1; j<=10;j++){
                sonuc=i*j;
                System.out.println(i +" * " +j +" = " +sonuc);
            }
        }
    }
}

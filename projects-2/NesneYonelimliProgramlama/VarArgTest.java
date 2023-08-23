package Okul.NesneYonelimliProgramlama;

public class VarArgTest {
    public int sum(int... args){
        int sum=0;
        for (int arg:args){
            sum+=arg;

        }
        return sum;
    }

    public void fun(){
        //parametre kabul etmeyen
    }

    public void fun(int i){
        //1 tane parametre kabul eden
    }
    public void fun(int i, int j){
        //2 tane parametre kabul eden
    }
    public void fun(int i,int j,int... args){
        //2 tabe parametre 1 tane args
    }
    public static void main(String[] args) {
        VarArgTest test =new VarArgTest();
        System.out.println(test.sum());
        System.out.println(test.sum(1));
        System.out.println(test.sum(1,2,5,65,44,58,523));
        System.out.println("****************************************");

    }
}

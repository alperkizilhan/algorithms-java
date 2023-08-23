package Okul.NesneYonelimliProgramlama;

public class BlockTest {
    static double sd;
    double d; //vu değere staticten erişemeyiz
    //static blok
    static {
        sd=5;
        System.out.println("inside static block");

    }

    //instance blok
    {
        d=5;
        System.out.println("ınside instance blok");

    }

    //blok test constructor
    public BlockTest(){
        System.out.println("inside constructor");
    }
    public static void main(String[] args) {


    }
}

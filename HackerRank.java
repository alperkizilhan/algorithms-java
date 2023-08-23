package HackerRank;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

/*
in:
java 100
cpp 65
python 50

out:
================================
java           100
cpp            065
python         050
================================
 */
public class HackerRank {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String s1= scanner.next();
        int n1= scanner.nextInt();
        String s2= scanner.next();
        int n2= scanner.nextInt();
        String s3= scanner.next();
        int n3= scanner.nextInt();
        System.out.println("================================");
        System.out.print(s1);
        System.out.print("               ");
        System.out.println(n1);
        System.out.print(s2);
        System.out.print("               ");
        System.out.println(n2);
        System.out.print(s3);
        System.out.print("               ");
        System.out.println(n3);
        System.out.println("================================");

    }
}

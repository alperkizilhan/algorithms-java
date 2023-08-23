package Okul.Odevler;

import java.util.Scanner;

public class PalindromWithRegex {
    public static void main(String[] args) {
        System.out.println("Enter a text");
        Scanner scanner=new Scanner(System.in);
        String text= scanner.nextLine();

        if(isPalindrome(text)){
            System.out.println("is Palindrome");
        }else{
            System.out.println("is not Palindrome");
        }
    }

    public static boolean isPalindrome(String text){
        String filteredText=filterText(text);
        String reversedText = reverseText(filteredText);

        return filteredText.equalsIgnoreCase(reversedText); // buyuk kucuk ayrımı yapmaması ıcın ıgnorecase ı kullandık

    }

    public static String filterText(String text){
        StringBuilder filteredText=new StringBuilder();
        for(int i=0;i<text.length();i++){
            if(Character.isLetterOrDigit(text.charAt(i))){
                filteredText.append(text.charAt(i));
            }
        }
        return filteredText.toString();
    }

    public static String reverseText(String text){
        StringBuilder reversedText= new StringBuilder(text);
        reversedText.reverse();
        return reversedText.toString();
    }

}

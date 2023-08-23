package Okul.Odevler;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MialKontrolRegex {
    public static void main(String[] args) {
        String emailStr="ahskdhgmail.com";
         Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        if(matcher.find())
            System.out.println("hellA AMK");
    }




}

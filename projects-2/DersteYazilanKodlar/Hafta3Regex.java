package Okul.DersteYazilanKodlar;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hafta3Regex {
    public static void main(String[] args) {

        String history = "in 1991 Oak was released,\t" +
                "in 1995 it was renamed as java 1.0 was released in 1996";

        System.out.println(history.replaceAll("[Ii]n", "at"));
        System.out.println("****************************************************************************************");
        System.out.println(history.replaceAll("[0-9]", "Y"));
        System.out.println("****************************************************************************************");
        System.out.println(history.replaceAll("\\s", ""));
        System.out.println("****************************************************************************************");
        System.out.println(history.replaceAll("[^\\w]", "-")); // word olmayan karakterleri - ile değiştir. ^ değili demek.
        System.out.println("****************************************************************************************");
        System.out.println(history.replaceAll("^in", "at")); // en baştaki in i at ile değiştirdi.
        System.out.println("****************************************************************************************");
        System.out.println(history.replaceAll("1996$", "Y")); //en sondakini Y ile değiştir.
        System.out.println("****************************************************************************************");
        System.out.println("****************************************************************************************");

        String history2 = "in 1991 Oak was released,\t" +
                "in 1996 it was renamed as java, Java 19 was released in 1995";
        System.out.println(history2.replaceAll("19{1,2}", "YY"));
        System.out.println("****************************************************************************************");
        System.out.println(history2.replaceAll("19{2}", "YY"));
        System.out.println("****************************************************************************************");
        System.out.println("****************************************************************************************");

        String text = "<h1>Heading</h1>" +
                "<h2>Sub Heading</h2>" +
                "<p>Paragraph</p>" +
                "<h2>Summary</h2>" +
                "<p>Another paragraph</p>";

        Pattern pattern = Pattern.compile("<h2>");
        Matcher matcher = pattern.matcher(text);

        /* matcher.reset();
        while (matcher.find()){
            System.out.println(matcher.start() + " " +matcher.end());
        }

         */
        /*
        Pattern pattern1 = Pattern.compile("<h2>. *?</h2>");
        Matcher matcher1 = pattern.matcher(text);
        matcher1.reset();
        while (matcher1.find()) {
            System.out.println(matcher1.group(1));
        }

         */




    }

//KULLANICIDAN BİR STRİNG ALIP MAİL OLUP OLMAIĞINI KONTROL EDEN PROGRAM YAP
    //WEBSİTE TELEFON NO

}

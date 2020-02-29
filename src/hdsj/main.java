package hdsj;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {
    public static void main(String[] args) {
        String text = "exemple@gmail.com";
        Pattern pattern = Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$");
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    }
}
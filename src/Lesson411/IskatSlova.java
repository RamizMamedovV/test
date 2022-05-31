package Lesson411;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IskatSlova {
    public static void main(String[] args) {
        String text = "U Seni i Sani v senyax som s usami";
        Pattern pattern = Pattern.compile("\\b[Ss][a-z]+\\b");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    }
}

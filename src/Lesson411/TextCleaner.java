package Lesson411;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextCleaner {
    public static void main(String[] args) {
        String text = "<strike>eto udalit!</strike>a eto xorosiy tekst, eqo troqat ne nado." +
                "<strike> i eto ne nujno!</strike>";
        Pattern pattern = Pattern.compile("<strike>.*?</strike>");

        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            System.out.println("Found match\n" + text.substring(start, end)
                    + "\nfrom " + start + " to " + (end - 1));

       /* String text = "Ivan Petrov";
        Pattern pattern = Pattern.compile("(.*) (.*)");
        Matcher matcher = pattern.matcher(text);
//меняем первую группу со второй
        System.out.println(matcher.replaceFirst("$2 $1"));

        System.out.println("Clean the text");
        System.out.println(matcher.replaceAll(""));*/

        /*StringBuilder sb = new StringBuilder();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 200000; i++) {
            sb.insert(0, "ABC");
        }
        System.out.println((System.currentTimeMillis() - startTime));*/
        }

    }

}
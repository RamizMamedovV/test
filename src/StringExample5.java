import java.util.Objects;

public class StringExample5 {
    public static void main(String[] args) {
        String str = "Hello";
        String str1 = "Hi";
        System.out.println(str.equals (str1));
        System.out.println(Objects.equals(str, str1));

    }
}

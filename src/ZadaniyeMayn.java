import java.util.Scanner;

public class ZadaniyeMayn {
    public static void main(String[] args) {
        char ch1 = 'h';
        char ch2 = 'i';
        char ch3 = 'b';
        System.out.println(decode(ch1) +""+ decode(ch2) +""+ decode(ch3));
    }
    public static String decode(char ch) {
        String result ="";
        switch (ch) {
            case 'h':
                result ="Hello. ";
                break;
            case 'i':
            case 'm':
            case 'k':
                result = "i can decode. ";
                break;
            case 'b':
                result = "Bye ! ";
                break;
            default:
                result = "i do not know this symbols:((";
        }
        return result;
    }

}

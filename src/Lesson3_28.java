public class Lesson3_28 {
    public static void main(String[] args) {
        System.out.println(removeWhiteSpaces("   A roza upala na lapu Azora"));
    }
    private static String removeWhiteSpaces(String str) {
        return str.replaceAll(" ", "");
    }
}

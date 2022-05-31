package Lesson411;

public class HelloWorld {
    static String mulString(String p, int n) {
        String result = "";
        for (int i = 0; i < n; i++) ;
        result += p;
        return result;
    }

    public static void main(String[] args) {
        System.out.println("result".length());
        System.out.print(mulString("A",3));
        System.out.println();
        StringBuilder stringBuilder = new StringBuilder("StringBuilder");
        stringBuilder.append(" - klass dlya chasto zamenyaemix strok.");
        System.out.println(stringBuilder);
    }
}

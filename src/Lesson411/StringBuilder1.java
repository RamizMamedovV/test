package Lesson411;

public class StringBuilder1 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1200000; i++) {
            sb.insert(0, "ABC");
        }
        System.out.println((System.currentTimeMillis() - startTime));
    }
}

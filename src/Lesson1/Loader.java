package Lesson1;

public class Loader {

    public static void main(String[] args) {
      int x = add(3,4);
      int y = add (x, 9);
      int g = add(y, 10);
        System.out.println(g);

    }

    private static int add(int i, int i1) {
        int p = i + i1;
        return p;
    }

}

package TatyanaMilkina.Lesson7;

public class LessonAlgoritmi {
    public static void main(String[] args) {
        double[] name = {10.1, 10.2, 10.3, 10.4};
        double result = 0;
        for (double d : name) {
            result += d;
        }
        System.out.println("srednee: " + result / name.length);
    }
}

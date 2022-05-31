package TatyanaMilkina;

import java.util.Scanner;

public class If1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            compareNumber(number);
        } else {
            System.out.println("znacheniye ne verno");
        }
    }

    private static void compareNumber(int number) {
        if (number > 0 && number < 10) {
            System.out.println("polojit chislo mense 10");
        } else {
            System.out.println("polojit chislo bolse 10 ili otricatelnoe");
        }
    }
}

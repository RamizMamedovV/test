import java.io.InputStream;
import java.util.Scanner;

public class Calculyator {

    public void Scanner(InputStream in) {
    }

    public static void main(String[] args) {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            int x;
            int operand1 = scanner.nextInt();
            char operation = scanner.next().charAt(0);
            int operand2 = scanner.nextInt();
            if (operation == '*') {
                x = operand1 * operand2;
                System.out.println(x);
            } else if (operation == '+') {
                x = operand1 + operand2;
                System.out.println(x);
            } else if (operation == '-') {
                x = operand1 - operand2;
                System.out.println(x);
            } else if (operation == '/') {
                x = operand1 / operand2;
                System.out.println(x);
            } else {
                System.out.println("vi vveli ne vernoe deystvie))" + (operation));
            }

        }
    }
}

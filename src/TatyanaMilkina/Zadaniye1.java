package TatyanaMilkina;

import java.util.Scanner;

public class Zadaniye1 {
    public static void main(String[] args) {
        System.out.println("vvedite den nedeli");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x == 1) {
            System.out.println("ponedelnik");
        } else if (x == 2) {
            System.out.println("vtor");
        } else if (x == 3) {
            System.out.println("sreda");
        } else if (x == 4) {
            System.out.println("chetverg");
        } else if (x == 5) {
            System.out.println("pyatnica");
        } else if (x == 6 || x == 7) {
            System.out.println("vixodnoy");
        } else {
            System.out.println("nedelya iz 7 dney))");
        }
    }
}

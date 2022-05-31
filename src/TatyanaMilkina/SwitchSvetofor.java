package TatyanaMilkina;

import java.util.Scanner;

public class SwitchSvetofor {
    public static void main(String[] args) {
        System.out.println("vvedite cvet svetofora");
        System.out.println("qde 1- red, 2- yellow, 3- green");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        switch (x) {
            case 1:
                System.out.println("STOP");
                break;
            case 2:
                System.out.println("wait");
                break;
            case 3:
                System.out.println("go");
                break;
            default:
                System.out.println("ne pravilno vvel:))");
        }
    }
}

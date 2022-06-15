package lesson3Skill;

import java.util.Scanner;

public class CheckPassword {

    public static void main(String[] args) {
        System.out.println("Vvedite vase imya: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println();
        System.out.println("Vvedite vas parol(8 simvolov): ");
        Scanner scanner1 = new Scanner(System.in);
        String parol = scanner1.nextLine();
        if (parol.length() < 8 || parol.length() > 15) {
            do {
                System.out.println("Parol > 8, < 15 doljen bit!");
                parol = scanner1.nextLine();
            } while (parol.length() < 8 || parol.length() > 15);
        }
        System.out.printf("%s, Vas parol: %s", name, parol);
    }
}
     /*   Scanner sc = new Scanner(System.in);
        System.out.println("Vvedite imya:");
        String name = sc.nextLine();
        System.out.println("Sozdayte parol:");
        String PW = sc.nextLine();
        if (PW.length() < 8 || PW.length() > 15) {
            do {
                System.out.println("Dlina doljna sostavit ot 8 do 15 simbols");
                PW = sc.nextLine();
            } while (PW.length() < 8 || PW.length() > 15);
        }
        System.out.printf("%s, Vas parol: %s", name, PW);
    }
}*/
package lesson6SkillF;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        Animals dog = new Animals(true, false, "Dog", 10);
        System.out.print(dog);
        System.out.println(" ");
        Animals cat = new Animals(true, false,"murr", 9 );
        System.out.print(cat);
        System.out.println(" ");
        Animals sheep = new Animals(true,true,"sheep", 10);
        System.out.println(sheep);
    }
}

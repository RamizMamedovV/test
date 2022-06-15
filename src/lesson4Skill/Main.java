package lesson4Skill;

public class Main {
    public static void main(String[] args) {
       /* Cat barsik = new Cat();
        barsik.meow();
        barsik.weight = 3000;
        barsik.color = "Orange";*/
        Cat barsik = new Cat(); // создали кота из класса Cat
        Cat bigCat = new Cat(5500, "Murka", 2, "Black");
        Cat smallCat = new Cat(1000, "Kuzya", 1, "White");
    }
}

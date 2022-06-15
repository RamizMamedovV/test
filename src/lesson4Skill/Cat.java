package lesson4Skill;

public class Cat {
    //Поля класса
    double weight;
    String name;
    int age;
    String color;
    //Методы класса
    void meow() {
        System.out.println("Meow");
    }

    void pee() {
        weight -= 20;
    }

    void eat() {
        this.weight += 50;
    }

    public Cat() {
        this(3000, "Barsik", 1, "Grey");
        /*weight = 3000;
        name = "Barsik";
        age = 1;
        color = "Grey";*/
    }

    public Cat(double weight, String name, int age, String color) {
        /* как видно, мы создали новые переменные и указали их тип прямо в скобках, описывающих, какие именно переменные будут передаваться этой функции, когда мы будем её использовать. Обратите внимание, что именно значения этих переменных (например, name1) потом передаются полям класса (например, name)*/
        this.weight = weight;
        this.name = name;
        this.age = age;
        this.color = color;
    }
}

package Lesson4;

public class Main {
    public static void main(String[] args) {
        Cat bigCat = new Cat(5500, "Murka",2, "Black");
        Cat smallCat = new Cat(1000, "Kuzya",1, "White");
        bigCat.setName("Pushok");
        System.out.println(bigCat.getName());
        System.out.println(smallCat.getName());
    }

}

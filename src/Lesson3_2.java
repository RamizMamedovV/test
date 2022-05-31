public class Lesson3_2 {
    public static void main(String[] args) {
        String a = "иван иванов";
        String b = "Иван Иванов";
        checkUserName (a,b);
    }

    public static void checkUserName(String a,String b) {
        String bcopy = b.replace(" ", "");
        if (a.equalsIgnoreCase(b) == true)
            System.out.println("viberite druqoe imya!");

        else
            System.out.println("dlina" + " " + b.length() + " " + "simvolov");
        System.out.println("bez prob" + " " + bcopy.length() + " " + "simvolov");

    }
}
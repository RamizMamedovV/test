package TatyanaMilkina.Lesson9;

public class Aspirant extends Student {
    String work;

    public Aspirant(String firsName, String lastName, String group, double avgMark, String work) {
        super(firsName, lastName, group, avgMark);
        this.work = work;
    }

    void print() {
        System.out.println(firsName);
    }

    @Override
    public double getScholarShip() {
        return avgMark == 5 ? 200 : 180;
    }

    public static void main(String[] args) {
        Student student = new Student("ivan", "ivanov",
                "group 0", 4.5);
        Aspirant aspirant1 = new Aspirant("petr", "petrov",
                "group1", 5, "work1");
        Aspirant aspirant2 = new Aspirant("pet", "petov",
                "group2", 4, "work2");

        System.out.println(" mmm =" + aspirant2.work);
    }

}

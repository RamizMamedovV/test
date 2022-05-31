package TatyanaMilkina.Lesson9;

public class Student {
    String firsName, lastName, group;
    double avgMark;

    public Student(String firsName, String lastName, String group, double avgMark) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.group = group;
        this.avgMark = avgMark;
    }

    public Student() {
    }

    public double getScholarShip() {
return avgMark == 5? 100 : 80 ;
    }
}


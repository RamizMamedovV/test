package Lesson411;

public class Plane {
    public static void main(String[] args) {
        Plane1 plane = new Plane1();
        plane.flyStraight(50);
        plane.printPosition();
        plane.flyUp(80, 90);
        plane.printPosition();
        plane.turnRight();
        plane.printPosition();
        plane.flyStraight(30);
        plane.printPosition();
        //plane.dropBombs();
        plane.flyStraight(40);
        plane.printPosition();
        plane.flyDown(100, 10);
        //plane.fillFuel();
        plane.flyDown(100, 10);
        //plane.fillFuel();*/
        plane.printPosition();

    }
}

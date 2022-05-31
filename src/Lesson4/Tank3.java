package Lesson4;

public class Tank3 {
    public static void main(String[] args) {
        // At (0;0) fuel=100
        Tank32 justTank = new Tank32();
// At (10;10) fuel=100
        Tank32 anywareTank = new Tank32(10, 10);
// At (20;30) fuel=200
        Tank32 customTank = new Tank32(20, 30, 200);
        justTank.goForward(200);
        justTank.printPosition();
        anywareTank.goBackward(-200);
        anywareTank.printPosition();
        customTank.goForward(201);
        customTank.printPosition();
    }
}

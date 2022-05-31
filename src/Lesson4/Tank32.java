package Lesson4;

public class Tank32 {
    private int x = 0;
    private int y = 0;
    private int[] direction = {1,0};
    private int fuel;

    public Tank32(int x, int y, int fuel) {
        this.x = x;
        this.y = y;
        this.fuel = fuel;
    }

    public Tank32(int x, int y) {
        this(x, y, 100);
    }

    public Tank32() {
        this(0,0, 100);
    }

    public void goForward(int distance) {
        if (fuel - Math.abs(distance) < 0)
            distance = fuel * Math.abs(distance) / distance;

        this.x += distance * direction[0];
        this.y += distance * direction[1];

        fuel -= Math.abs(distance);
    }

    public void printPosition(){
        System.out.println("The Tank is at " + x + ", " + y + " now.");
    }

    public void goBackward(int distance) {
        goForward(-distance);
    }

    public void turnRight() {
        turn(-1);
    }

    public void turnLeft() {
        turn(1);
    }

    private void turn(int i) {
        if (direction[0] == 1) {
            direction[0] = 0;
            direction[1] = -1 * i;
        } else if (direction[0] == -1) {
            direction[0] = 0;
            direction[1] = 1 * i;
        } else if (direction[0] == 0) {
            direction[0] = -direction[1];
            direction[1] = 0;
        }
    }
}

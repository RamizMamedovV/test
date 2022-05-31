package Lesson411;

/*public class TankTurn {
    public static void main(String[] args) {
        Tank tank = new Tank();
        tank.goForward(10);
        tank.printPosition();
        tank.turnRight();
        tank.goForward(50);
        tank.printPosition();
        tank.turnLeft();
        tank.goBackward(100);
        tank.printPosition();
    }
}
class Tank {
    private int x=0;
    private int y=0;
    private int[] direction = {1, 0};

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Tank() {
        this(0,0);
    }

    public void goForward(int distance) {
        this.x += distance * direction[0];
        this.y += distance * direction[1];
    }

    public void printPosition() {
        System.out.println("The tank is at " + x + "," + y + "now");
    }

    public void goBackward(int distance) {
        goForward(-distance);
    }

    public void turnRight() {
        if (direction[0] == 0) {
            direction[0] = -direction[1];
            direction[1]= 0;
        } else {
            direction[1] = direction[0];
            direction[0] = 0;
        }
    }

    public void turnLeft() {
        if (direction[0] == 0) {
            direction[0] = direction[1];
            direction[1]= 0;
        } else {
            direction[1] = -direction[0];
            direction[0] = 0;
        }
    }
}
*/
package Lesson411;

class Plane1 {
    private int x = 0;
    private int y = 0;
    private int[] direction = {1, 0};
    private int v;
    private int fuel = 300;

    public Plane1(int x, int y, int v, int fuel) {
        this.x = x;
        this.y = y;
        this.v = v;
        this.fuel = fuel;
    }

    public Plane1() {
        this(0, 0, 0,300);
    }

    public void flyStraight(int distance) {
        this.x += distance * direction[0];
        this.y = distance * direction[1];
        this.v = v;
        this.fuel -= distance;
    }

    public void flyUp(int distance,int visota) {
        this.x += distance * direction[0];
        this.y += distance * direction[1];
        this.v += distance;
        this.fuel -= distance;
    }
    public void printPosition() {
        System.out.println("vas samolyot " + x + "," + y + ". visota: " + v + ", fuel: " + fuel + "now");
    }
    public void turnRight() {
        if (direction[0] == 0) {
            direction[0] = -direction[1];
            direction[1] = 0;
        } else {
            direction[1] = direction[0];
            direction[0] = 0;
        }
    }
}
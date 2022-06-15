package lesson4Skill;

public class Tank {
    private int x = 0;
    //private int y = 0;
    //private int[] position = {0,0};

    public Tank() {
    }


    public void goForward(int i) {
        this.x += i;
}
public void goBackward(int i) {
        this.x -= i;
}
public void printPosition() {
    System.out.println("The tank is at " + x);
}



/* The Tank is at 10 now.
    The Tank is at 60 now.
    The Tank is at -40 now.*/
}

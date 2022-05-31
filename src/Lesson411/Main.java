package Lesson411;

public class Main {
    public static void main(String[] args) {
        Tank justTank = new Tank(0, 0, 100);
        Tank anywhereTank = new Tank(10, 10, 100);
        Tank customTank = new Tank(20, 30, 200);
        justTank.goForward(200);
        justTank.printPosition();
        anywhereTank.goBackward(-200);
        anywhereTank.printPosition();
        customTank.goForward(201);
        customTank.printPosition();
    }

    public static class Tank {
        private int x;
        private int y;
        //private int i = 0;
        private int z;

        public Tank(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public void goForward (int distance) {
            do {
                this.x +=1;
                this.z -=1;
            } while (z > 0);
        }
        public void goBackward (int distance) {
           // int i = 0;
            do {
                this.x +=1;
                this.z -=1;
            } while (z > 0);
        }


        public void printPosition() {
            System.out.println("The Tank is at " +  x +", "+ y +" " + " now.");
        }

    }
}




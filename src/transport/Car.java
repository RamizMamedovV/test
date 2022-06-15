package transport;

public abstract class Car extends Transport {
    protected String brand;
    private int horsePower;
    private boolean isAwd;
    double acceleration;

    public Car() {
        this("mazda");
        horsePower = 100;
        isAwd = false;
        acceleration = 10;
    }

    public Car(String brand, int horsePower, boolean isAwd, double acceleration) {
        this(brand);
        this.horsePower = horsePower;
        this.isAwd = isAwd;
        this.acceleration = acceleration;
    }

    public Car(String brand) {
        super("Car");
        this.brand = brand;
    }

    public abstract void start();

  /*  public void start() {
        System.out.println("mazda was started ");
    }*/

    public void setAcceleration(double acceleration) {
        if (acceleration <= 0) {
            this.acceleration = 10;
        } else {
            this.acceleration = acceleration;
        }
        this.acceleration = acceleration;
    }

    public void setAwd(boolean awd) {
        isAwd = awd;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public double countSpeed(double time) {
        return (100 / acceleration) * time;
    }

    public void ride() {
        System.out.println("riding Car");
    }

    public String toString() {
        return "brand = " + brand + "\n"
                + "horsePower =" + horsePower + "\n"
                + "isAwd =" + isAwd + "\n"
                + "acceleration =" + acceleration;
    }
}

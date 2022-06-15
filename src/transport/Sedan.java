package transport;

public class Sedan extends Car{
    public Sedan() {
        super();
    }

    public Sedan(String brand, int horsePower, boolean isAwd, double acceleration) {
        super(brand, horsePower, isAwd, acceleration);
    }

    @Override
    public void start() {
        System.out.println(brand + "was started ");
    }
}

package transport;

public class Boat extends Transport {
    public Boat() {
        super("boat");
    }

    @Override
    public void ride() {
        System.out.println("Riding boat");
    }
}

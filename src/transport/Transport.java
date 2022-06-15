package transport;

public class Transport implements Rideable, Swimable {
    public String type = " none";

    public Transport(String type) {
        this.type = type;
    }

    @Override
    public void ride() {

        System.out.println("rideang transport");
    }
}

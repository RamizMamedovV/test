package transport;

public class App {
    public static void main(String[] args) {
        Car mazda = new Sedan();
        System.out.println(mazda);
        System.out.println(mazda.countSpeed(10));
        System.out.println();
        Car mercedes = new Sedan("mercedes", 200, true, 39.7);
        System.out.println(mercedes);
        System.out.println(mercedes.countSpeed(10));
       // mazda.ride();
        Rideable boat = new Boat();
        Rideable transport = new Transport("None");

        rideSomeTransport(mazda);
        rideSomeTransport(boat);
        rideSomeTransport(transport);
    }

    public static void rideSomeTransport(Rideable rideable) {
        rideable.ride();
    }
}

package TatyanaMilkina.Lesson9;

import java.util.Arrays;

public class Phone {
   private String number;
    private String model;
    private double weight;

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    void receiveCall(String name) {
        System.out.println("calling -" + name);
    }

    void receiveCall(String name, String number) {
        System.out.println("calling -" + name + ", with num -" + number);
        System.out.println("my number- " + getNumber());
        System.out.println("my number- this " + this.number);
    }

    public String getNumber() {
        return number;
    }

    void sendMessage(String message, String... numbers) {
        System.out.print("message: " + message + " is sending to");
        System.out.println(Arrays.toString(numbers));
    }
}

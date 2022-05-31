package TatyanaMilkina.Lesson9;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone phone1 = new Phone("896230032","Samsung",8.1);/*znacheniya mojno potom menyat ili
        dobavit kak vnizu ili s pomoshyu metodov "Set"*/
        Phone phone2 = new Phone("856230032","Apple");
        Phone phone3 = new Phone();
        //phone2.weight = 10; esli nujno, to potom parametri mojno dobavit

        phone1.setNumber("896230032");
        phone1.setModel("Samsung");
        phone1.setWeight(8.1);

        phone2.setNumber("856230032");
        phone2.setModel("Apple");
        phone2.setWeight(10);

        phone3.setNumber("856230032");
        phone3.setModel("Apple");
        phone3.setWeight(10);

        System.out.print("ves phone1 = " + phone1.getWeight() + ", ");
        System.out.print("number phone1 = " + phone1.getNumber() + ", ");
        System.out.print("model phone1 = " + phone1.getModel() + ", ");

        System.out.println("");

        System.out.print("ves phone2 = " + phone2.getWeight() + ", ");
        System.out.print("number phone2 = " + phone2.getNumber() + ", ");
        System.out.print("model phone2 = " + phone2.getModel() + ", ");

        System.out.println();
        System.out.print("ves phone3 = " + phone3.getWeight() + ", ");
        System.out.print("number phone3 = " + phone3.getNumber() + ", ");
        System.out.print("model phone3 = " + phone3.getModel() + ", ");

        System.out.println();

        phone1.receiveCall("Mamam", "89505005050 ");
        phone1.receiveCall("Kama");
        phone2.receiveCall("Amiskam");

        phone1.sendMessage("message1","89505050", "89525252");
        phone2.sendMessage("message2","89505050");


    }
}

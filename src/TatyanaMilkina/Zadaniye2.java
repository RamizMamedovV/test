package TatyanaMilkina;



public class Zadaniye2 {
    public static void main(String[] args) {
        if ("1".equals(args[0])) {
            System.out.println("ponedelnik");
        } else if ("2".equals(args[0])) {
            System.out.println("vtor");
        } else if ("3".equals(args[0])) {
            System.out.println("sreda");
        } else if ("4".equals(args[0])) {
            System.out.println("chetverg");
        } else if ("5".equals(args[0])) {
            System.out.println("pyatnica");
        } else if ("6".equals(args[0]) || "7".equals(args[0])) {
            System.out.println("vixodnoy");
        } else {
            System.out.println("nedelya iz 7 dney))");
        }
    }
}

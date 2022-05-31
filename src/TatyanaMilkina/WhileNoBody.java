package TatyanaMilkina;

public class WhileNoBody {
    public static void main(String[] args) {
        int i = 100;
        int j = 200;
        while (++i < --j) ;// net skobok - no body))
        System.out.println(" seredina" + i);
    }
}

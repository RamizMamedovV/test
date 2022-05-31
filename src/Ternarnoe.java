import javax.imageio.IIOException;
import java.io.IOException;

public class Ternarnoe {
    public static void main(String[] args) throws IOException {
        System.out.println(" vvedite cvet svetofora ");
        System.out.println("qde 1- krasniy, 2- jeltiy, 3- zelyoniy");
        int x;
        x = System.in.read();
        if (x == 1) {
            System.out.println("STOP");
        }
             else if (x == 2) {
                 System.out.println("jdat");
              }
              else if ( x == 3) {
                System.out.println("START");
              }
        else {
            System.out.println("ne pravilniy vvod :))");
        }
    }
}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Lesson210 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      //  double weight = Double.parseDouble(br.readLine());
        //double height = Double.parseDouble(br.readLine());
       // Body.massIndex(weight,height);
    }
    public static class Body {
        public static void massIndex(double weight, double height) {
            double massIndex = weight / (height * height);
            if (massIndex < 18.5) {
                System.out.println("nedoves");
            }
            if (massIndex >= 18.5 && massIndex <= 24.9) {
                System.out.println("norm!");
            }
            if (massIndex >= 25 && massIndex <= 29.9) {
                System.out.println("jirniy((");
            }
            if (massIndex >= 30) {
                System.out.println("ujass");
            }
        }
    }
}

package TatyanaMilkina.Lesson7;

import java.util.Arrays;
import static TatyanaMilkina.Lesson7.ArrayInverter.invert;

public class ArrayInvertTest {
    public static void main(String[] args) {
        testInvert(new int[]{});// anonimnaya forma obyavleniya massiva
        testInvert(new int[]{0});
        testInvert(new int[]{0, 1});
        testInvert(new int[]{0, 1, 2, 3, 4});
    }

    private static void testInvert(int[] array) {
        System.out.print(Arrays.toString(array) + " => ");//klass Arrays vizivzet metod toString (soderjaniye massiva)
        /*ArrayInverter.*/invert(array);/* vizov metoda iz drugogo klassa( pisim imya klassa +
        + "." imya metoda!
        inache, esli chasto vizivat metod iz drugogo klassa, mojno kak zdes na verxu...
        vizvat ("import static TatyanaMilkina.Lesson7.ArrayInverter.invert;")
         qde ukazivaetsa "package" + "." + "imya klassa" + "imya"  */
        System.out.println(Arrays.toString(array));
    }
}

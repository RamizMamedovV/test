package TatyanaMilkina.massive;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MassiveForEach {
    public static void main(String[] args) {
        char[][] ar = {
                {'r', 'h'},
                {'y', 'g', 'k'},
                {'b', 'f', 'j', 'v'},
                {'a', 'e', 't', 'r', 'n'},};
        int[] ra = {1,9,8, 2,6, 3, 5};
        String[][] ram = {
                {"odin-dva", "odin-tri"},
                {"dva-dva", "dva-tri"}
        };


        for (char[] row:ar) {
            for (char element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
            System.out.println("dlinna stroki = " + row.length);
        }
        System.out.println();
        System.out.println(Arrays.toString(ra));//vivodit ves massiv 1 merniy
        System.out.println();
        System.out.println(Arrays.deepToString(ram));//raspechativaet 2 merniy massiv
        System.out.println();
        Arrays.sort(ra);
        System.out.println(Arrays.toString(ra));//posle sort - sortiruet po vozrostaniyu
        System.out.println();
        int p1 = Arrays.binarySearch(ra, 6);// posle sor mojno nayti element v massive
        int p2 = Arrays.binarySearch(ra, 7);
        /* esli elementa net v massive, to vidaet predpolojitelnoe mesto
        no schitaet ne ot 0, a ot 1, (ved v massive nachinaetsa schet ot 0)
        to est poluchaetsa position + 1
         */
        System.out.println(p1 + " " + p2);

    }
}

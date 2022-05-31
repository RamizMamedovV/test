package TatyanaMilkina.massive;

import java.util.Arrays;

public class CopyMassive {
    public static void main(String[] args) {
        int[] arraySource = {1, 2, 3, 4, 5, 6};
        int[] arrayDastination = {0, 0, 0, 0, 0, 0, 0, 0};

        System.out.println("arraySource: " + Arrays.toString(arraySource));
        System.out.println("arrayDastination: " + Arrays.toString(arrayDastination));
        System.arraycopy(arraySource, 1, arrayDastination, 2, 3);
        /* esli najat na ctrl i navesti mishkoy na arrayCopy, to vsplivet parametr
        sintaksisa metoda: 1. object src= otkuda kopiruem, srcPos = poziciya iz cotoroy copy,
        desPoz= kuda copy, length = kolichestvo elementov
         */
        System.out.println("arrayDastination after arayCopy: " + Arrays.toString(arrayDastination));
        System.out.println();
        System.out.println(Arrays.toString(arraySource));
        System.arraycopy(arraySource, 1, arraySource, 2, 3);
        /* tak mojno copy iz massiva v sam massiv
        s perkritiyem oblastey
         */
        System.out.println(Arrays.toString(arraySource));

    }
}

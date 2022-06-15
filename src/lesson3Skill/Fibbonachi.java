package lesson3Skill;

import java.util.Arrays;

public class Fibbonachi {

    public static void main(String[] args) {
        int[] f = new int[30];
        f[0] = 1;
        f[1] = 1;
        for (int i = 2; i < f.length; i++) {
            f[i] = f[i-1]+ f[i-2];
        }
        System.out.println(Arrays.toString(f));
    }
}

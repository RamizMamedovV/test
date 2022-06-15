package lesson3Skill;

import java.util.Arrays;

public class MainMassive {
    public static int[] numbers = new int[100];
    public static void main(String[] args) {

        for (int i = 0; i<numbers.length; i++){
         numbers[i] += i*(Math.pow(-1, i));
        }
        System.out.println(Arrays.toString(numbers));
    }

}

public class Mas {
    public static void main(String[] args) {
        int[] nums = new int[11];
        int x = 5;
            for (int i = 0; i < nums.length; i++ ) {
                nums [i] = x;
                x++;
            }
            for (int item : nums) {
                System.out.println(item);

            }
        System.out.println(nums[5]);

    }
}

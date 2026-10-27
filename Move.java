import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] first = {0, 1, 0, 3, 12};
        moveZeroes(first);
        System.out.println(Arrays.toString(first));

        int[] second = {0};
        moveZeroes(second);
        System.out.println(Arrays.toString(second));
    }

    private static void moveZeroes(int[] nums) {
        int index = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[index++] = num;
            }
        }
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }
}

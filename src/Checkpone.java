import java.util.Arrays;
public class Checkpone {
    public static void main(String[] args) {
        int[] nums = {1, -2, 3, -4, 5, -6, 7};
        System.out.printf("\n original array:" + Arrays.toString(nums));
        boolean result = test(nums);
        System.out.printf("\n check the said array of integers alternates between positive and negative value!" + result);
    }

    public static boolean test(int[] nums) {
        for (int n : nums) {
            if (n == 0)
                return false;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > 0 && nums[i] > 0) {
                return false;
            } else if (nums[i - 1] < 0 && nums[i] < 0) {
                return false;
            }
        }
        return true;
    }
}


import java.util.Arrays;

public class Equilibrium {
    public static void main(String[] args) {
        int[] nums = {-7, 1, 5, 2, -4, 3, 0};
        System.out.println("original array:" + Arrays.toString(nums));
        equlibrium_indices(nums);
    }

    public static void equlibrium_indices(int[] nums) {
        int totalsum = 0;
        for (int n : nums) {
            totalsum += n;
        }
        int runningsum = 0;
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (totalsum - runningsum - n == runningsum) {
                System.out.println("equilibrium_indices found at:" + i);
            }
            runningsum += n;
        }
    }
}


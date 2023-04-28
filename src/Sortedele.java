import java.util.Arrays;
public class Sortedele {
    public static void main(String[] args) {
        int[] nums = {10, -2, 6, 8, 9};
        System.out.printf("\n original array:" + Arrays.toString(nums));
        int result = test(nums);
        System.out.printf("\n largest gab between sorted elements of the said array:" + result);
    }
    public static int test(int []nums){
        Arrays.sort(nums);
        int max_val=0;
        for (int i=0;i< nums.length-1;i++) {
            max_val = Math.max(nums[i + 1] - nums[i], max_val);
        }
        return max_val;
        }
    }


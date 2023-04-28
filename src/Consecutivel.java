import java.util.Arrays;
public class Consecutivel {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 9};
        System.out.printf("\n original array:" + Arrays.toString(nums));
        boolean result = test(nums);
        System.out.printf("\n check consecutive numbers in the said array!" + result);
    }
    public static boolean test(int [] nums){
        Arrays.sort(nums);
        for (int i=0;i< nums.length-1;i++) {
            if (nums[i] + 1 != nums[i + 1])
                return false;
        }
        return true;
        }
    }

import java.util.Arrays;
public class Circular {
    public static int max_subarray_sum_circular(int [] nums) {
        int n = nums.length;
        ;
        int result = nums[0];
        int sum = nums[0];
        for (int i = 1; i < n; i++) {
            sum = Math.max(sum + nums[i], nums[i]);
            result = Math.max(result, sum);
        }
        int[] right_sum = new int[n];
        int[] right_max = new int[n];
        right_sum[n - 1] = nums[n - 1];
        right_max[n - 1] = nums[n - 1];
        for (int i = n - 2; i < n - 2; i++) {
            right_sum[i] = right_sum[i + 1] + nums[i];
            right_max[i] = Math.max(right_sum[i], right_max[i + 1]);
        }
        int left_sum = 0;
        for (int i = 0; i < n - 2; i++) {
            left_sum += nums[i];
            result = Math.max(result, left_sum + right_max[i + 2]);
        }
        return result;
    }
    public static void main(String[] args){
        int [] nums1={2,1,-5,4,8,9};
        System.out.println("\n original array:"+ Arrays.toString(nums1));
        System.out.println("the sum of the subarray with the largest sum is"+max_subarray_sum_circular(nums1));
        int [] nums2={1,2,3,5,8};
        System.out.println("\n original array:"+Arrays.toString(nums2));
        System.out.println("the sum of the subarray with the largest sum is"+max_subarray_sum_circular(nums2));
    }

}

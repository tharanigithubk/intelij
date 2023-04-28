import java.util.Arrays;
public class Contiguoussmall {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int m_len = 6;
        int result = min_subarray_length(6, nums);
        System.out.printf("\n original array:" + Arrays.toString(nums));
        System.out.printf("\n minnimum length of a contiguous subarray of which the sum is %d,%d", m_len, result);
    }

    public static int min_subarray_length(int s, int[] nums) {
        int sum = 0, ctr = 0, min_len = Integer.MAX_VALUE;
        for (int i = 0, j = 0; j < nums.length;)
        {
            if (nums[j] >= s) {
                return 1;
            } else {
                sum += nums[j];
                ctr++;
                if (sum >= s) {
                    min_len = Math.min(min_len, ctr);
                    while (j > 1) {
                        sum -= nums[i];
                        ctr--;
                        i++;
                        if (sum < s) break;
                        min_len = Math.min(min_len, ctr);
                    }
                }
            }
            j++;
        }
        if (min_len == Integer.MAX_VALUE) {
            return 0;
        }
        return min_len;
    }
}


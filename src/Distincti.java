import java.util.Arrays;
public class Distincti {
    private static int []sort_Arrays(int []nums) {
        int x = -1, y = -1;
        int prev = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (prev > nums[i]) {
                if (x == -1) {
                    x = i - 1;
                    y = i;
                } else {
                    y = i;
                }
            }
            prev = nums[i];
        }
        swap_nums(nums, x, y);
        return nums;
    }
    private static void swap_nums(int []a,int i,int j) {
        int temp_val = a[i];
        a[i] = a[j];
        a[j] = temp_val;
    }
    public static void main(String[] args){
        int []nums1={3, 5, 6, 9, 8, 7 };
        System.out.println("\n original array:"+ Arrays.toString(nums1));
        int []result1=sort_Arrays(nums1);
        System.out.println("\n after sorting new array becomes:"+Arrays.toString(result1));
        int []nums2={5, 0, 1, 2, 3, 4, -2 };
        System.out.println("\n original array:"+Arrays.toString(nums2));
        int []result2=sort_Arrays(nums2);
        System.out.println("\n afyer sorting new array becomes:"+Arrays.toString(result2));
            }
        }


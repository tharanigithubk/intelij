import java.util.Arrays;
public class Ascendingorder {
    public static int[]findunsortedsubarray(int []nums) {
        int[] result = new int[3];
        int n = nums.length;
        int start = -1;
        int end = -2;
        int min = nums[n - 1];
        int max = nums[0];
        for (int i = 1; i < n; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[n - 1 - i]);
            if (nums[i] < max) {
                end = i;
            }
            if (nums[n - 1 - i] > min) {
                start = n - 1 - i;
            }
        }
        result[0] = start;
        result[1] = end;
        return result;
    }
    public static void main(String[] args){
        int []nums1={1,2,3,4,0,6};
        System.out.printf("original array"+ Arrays.toString(nums1));
        int []result1=findunsortedsubarray(nums1);
        System.out.printf("\n continuous subarray:\n");
        for (int i=result1[0];i<result1[1];i++) {
            System.out.print(nums1[i] + "");
        }
        int []nums2={1, 3, 2, 7, 5, 6, 4, 8};
        System.out.printf("original array"+Arrays.toString(nums2));
        int []result2=findunsortedsubarray(nums2);
        System.out.printf("\n continuous subarray:\n");
        for (int i=result2[0];i<=result2[1];i++){
            System.out.print(nums2[i]+" ");
            }
        }
    }
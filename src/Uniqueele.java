import java.util.Arrays;
public class Uniqueele {
    private static void swap_nums(int []nums,int i,int j){
        int t_nums=nums[i];
        nums[i]=nums[j];
        nums[j]=t_nums;
    }
    public static void rearrange_arrays_nums(int [] nums)
    {
        for (int i=1;i< nums.length;i+=2){
            if (nums[i-1]>nums[i]){
                swap_nums(nums,i-1,i);
            }
            if (i+1<nums.length&&nums[i+1]>nums[i]){
                swap_nums(nums,i+1,i);
            }
        }
    }
    public static void main(String[] args){
        int []nums={1,2,3,4,5};
        System.out.println("original array:"+ Arrays.toString(nums));
        rearrange_arrays_nums(nums);
        System.out.println("\n array with every second element is greater than its left and right elements:\n"+Arrays.toString(nums));
    }
}

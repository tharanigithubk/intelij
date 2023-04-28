import java.util.Arrays;

public class Nextge {
    public static void main(String[] args) {
        int nums[] = {20, 30, -40, 7, -8, 9};
        int result[];
        System.out.println("original array");
        System.out.println(Arrays.toString(nums));
        result = next_greatest_num(nums);
        System.out.println("the modified array:");
        System.out.println(Arrays.toString(result));
    }
    static int[]next_greatest_num(int arr_nums[])
    {
        int size= arr_nums.length;
        int max_from_right_num=arr_nums[size-1];
        arr_nums[size-1]=-1;
        for (int i=size-2;i>=0;i--) {
            int temp = arr_nums[i];
            arr_nums[i] = max_from_right_num;
            if (max_from_right_num < temp)
                max_from_right_num = temp;
        }
        return arr_nums;
        }
    }


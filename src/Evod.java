import java.util.Arrays;
public class Evod {
    public static void main(String[] args){
        int nums[]={10,9,8,7,6,5,4,3,2,1};
        int result[];
        System.out.println("original array");
        System.out.println(Arrays.toString(nums));
        result=separate_odd_even(nums);
        System.out.println("array after separation");
        System.out.println(Arrays.toString(result));
    }
    static int[]separate_odd_even(int arr[])
    {
        int left_side=0,right_side=arr.length-1;
        while (left_side<right_side)
        {
            while (arr[left_side] % 2 == 0 && left_side < right_side)
                left_side++;
            while (arr[right_side] % 2 == 1 && left_side < right_side)
                right_side--;
            if (left_side < right_side)
            {
                int temp = arr[left_side];
                arr[left_side] = arr[right_side];
                arr[right_side] = temp;
                left_side++;
                right_side--;
            }
        }
        return  arr;
    }
}

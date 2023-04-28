import java.util.Arrays;
import java.util.Random;

public class Shuffle {
    public static void shuffle(int nums[])
    {
        for (int i=nums.length-1;i>=1;i--)
        {
            Random rand=new Random();
            int j=rand.nextInt(i+1);
            swap_elements(nums,i,j);
        }
    }
    private static void swap_elements(int []nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void main(String[] args){
        int []nums={1,2,3,4,5};
        System.out.println("original array:"+ Arrays.toString(nums));
        shuffle(nums);
        System.out.println("sorted array:"+Arrays.toString(nums));
    }
}

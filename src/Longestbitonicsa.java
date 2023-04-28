import java.util.Arrays;

public class Longestbitonicsa {
    public static int find_bitonic_subarray(int [] nums)
    {
        int []incre_array=new int[nums.length];
        incre_array[0]=1;
        for (int i=1;i<nums.length;i++){
            incre_array[i]=1;
            if (nums[i-1]<nums[i]){
                incre_array[i]=incre_array[i-1]+1;
            }
        }
        int [] decre_array=new int[nums.length];
        decre_array[nums.length-1]=1;
        for (int i=nums.length-2;i>0;i--) {
            decre_array[i] = 1;
            if (nums[i] > nums[i + 1]) {
                decre_array[i] = decre_array[i + 1] + 1;
            }
        }
        int lbs_len=1;
        int start=0,end=0;
        for (int i=0;i<nums.length;i++)
        {
            if (lbs_len<incre_array[i]+decre_array[i]-1)
            {
                lbs_len=incre_array[i]+decre_array[i]-1;
                start=i-incre_array[i]+1;
                end=i+decre_array[i]-1;
            }
        }
        System.out.println("the longest bitonic subarray is{"+start+","+end+",]");
        for (int x=start;x<=end;x++) {
            System.out.println(nums[x] + " ");
        }
        System.out.println("\n the longest bitonic subarray is"+lbs_len);
        return lbs_len;
    }
    public static void main(String[] args){
        int [] nums={4,5,6,7,8,9};
        System.out.println("\n original array:"+ Arrays.toString(nums));
        find_bitonic_subarray(nums);
    }
}

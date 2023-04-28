import java.util.Arrays;

public class Positivev {
    public static int[]rearrange(int [] new_arra,int n)
    {
        int temp[]=new int[n];
        int small_num=0,large_num=n-1;
        boolean flag=true;
        for (int i=0;i<n;i++) {
            if (flag)
                temp[i] = new_arra[large_num--];
            else
                temp[i] = new_arra[small_num++];
            flag = !flag;
        }
        return  temp;
    }
    public static void main(String[] args){
        int nums[]=new int[]{5,10,15,20,25,30};
        int result[];
        System.out.println("original value:");
        System.out.println(Arrays.toString(nums));
        result=rearrange(nums,nums.length);
        System.out.println("new array");
        System.out.println(Arrays.toString(result));
    }
}

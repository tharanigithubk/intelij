public class Combination
{
    public static void main(String[] args){
        int nums[] = {10, 20,30,40,1,2,3,4,5};
        int n = nums.length;
        int s =67;
        System.out.println("Given value:" + s);
        System.out.println("Combination of four elements:");
        for (int i = 0; i < n - 3; i++)
        {
            for (int j = i + 1; j < n - 2; j++)
            {
                for (int k = j + 1; k< n - 1; k++)
                {
                    for (int l = k + 1; l< n; l++)
                    {
                        if (nums[i]+nums[j]+nums[k]+nums[l]==s)
                            System.out.print("\n" + nums[i] + "" + nums[j] + "" + nums[k] + "" + nums[l]);
                    }
                }
            }
        }
    }
}

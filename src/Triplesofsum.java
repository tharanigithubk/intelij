import java.util.Arrays;
public class Triplesofsum {
    public static void find_and_print_all_Triples(int[]nums,int sum,int alen)
    {
        System.out.println("\n Triples of sum"+sum);
        for (int i=0;i<=alen-3;i++)
        {
            int k=sum-nums[i];
            int l_index=i+1,h_index=nums.length-1;
            while(l_index<h_index) {
                if (nums[l_index] + nums[h_index] < k) {
                    l_index++;
                } else if (nums[l_index] + nums[h_index] > k) {
                    h_index--;
                } else {
                    System.out.println("(" + nums[i] + " " + nums[l_index] + "" + nums[h_index] + ")");
                    l_index++;
                    h_index--;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 0, 5, 6};
        int alen =nums.length;
        System.out.println("\n original array:" + Arrays.toString(nums));
        Arrays.sort(nums);
        int sum = 7;
        find_and_print_all_Triples(nums, sum, alen);
    }
}


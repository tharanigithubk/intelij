import java.util.Arrays;
public class Contignuous {
    public static int largest_sum(int []A) {
        int max_ele_val = 0;
        int max_end = 0;
        for (int i : A) {
            max_end = max_end + i;
            max_end = Integer.max(max_end, 0);
            max_ele_val = Integer.max(max_ele_val, max_end);
        }
        return max_ele_val;
    }
    public static void main(String[] args){
        int []A={1,2,-3,4,5,6,7,8};
        System.out.println("\n original array:"+ Arrays.toString(A));
        System.out.println("the largest sum of contiguous sub_array:"+largest_sum(A));
    }
}

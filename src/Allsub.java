import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Allsub {
    public static void print_all_subarrays(int[] A) {
        List<Integer> llist = new ArrayList<Integer>();
        for (int i = 0; i < A.length; i++) {
            int sum = 0;
            llist.removeAll(llist);
            for (int j = i; j < A.length; j++) {
                sum += A[j];
                llist.add(A[j]);
                if (sum == 0) {
                    System.out.println("sub_array with 0 sum:" + llist.toString());
                }
            }
        }
    }
    public static void main(String[] args){
        int[] nums1={1,2,3,4,5,6};
        System.out.println("\n original array:"+ Arrays.toString(nums1));
        print_all_subarrays(nums1);
        int [] nums2={2,4,5,-8,4};
        System.out.println("\n original array:"+Arrays.toString(nums2));
        print_all_subarrays(nums2);
        int [] nums3={9,-8,7,6,5};
        System.out.println("\n original array:"+Arrays.toString(nums3));
        print_all_subarrays(nums3);
    }
}

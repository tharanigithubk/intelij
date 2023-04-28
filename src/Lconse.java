import java.util.HashSet;

public class Lconse {
    public static void main(String[] args) {
        int nums[] = {45, 1, 2, 100, 3, 50, 4, 5};
        System.out.println("oal:" + nums.length);
        System.out.println("array elements are:");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + "");
        }
        System.out.println("\n the new length of the array is:" + longest_sequence(nums));
    }

    public static int longest_sequence(int[] nums) {
        final HashSet<Integer> h_set = new HashSet<Integer>();
        for (int i : nums) h_set.add(i);
        int longest_sequence_len = 0;
        for (int i : nums) {
            int length = 1;
            for (int j = i - 1; h_set.contains(j); --j) {
                h_set.remove(j);
                ++length;
            }
            for (int j = i + 1;h_set.contains(j); ++j) {
                h_set.remove(j);
                ++length;
            }
            longest_sequence_len = Math.max(longest_sequence_len,length);
        }
        return longest_sequence_len;
    }
}




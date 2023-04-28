import java.util.Arrays;
public class Negdomain {
    public static void main(String[] args) {
        int[] nums = {1, -2, 3, -4, 5, 6};
        System.out.printf("\n original array:" + Arrays.toString(nums));
        boolean result = test(nums);
        System.out.printf("\n check negative dominance in the said array!" + result);
    }
    public static boolean test(int[]nums){
        long count_negative,count_positive;
        nums=Arrays.stream(nums).distinct().toArray();
        count_negative=Arrays.stream(nums).filter(s->s<0).count();
        count_positive=Arrays.stream(nums).filter(s->s<0).count();
        return count_negative>count_positive;
    }
}

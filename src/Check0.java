import java.util.Arrays;
public class Check0 {
    public static void main(String[] args) {
        int[]arr={25,-44,99,64,55};
        System.out.println("Array:"+Arrays.toString(arr));
        System.out.println("Result:"+test(arr));
    }public static boolean test(int[]nums){
        for(int num:nums){
            if (num ==0||num==-1){
                return false;
            }
        }
            return true;
        }
    }

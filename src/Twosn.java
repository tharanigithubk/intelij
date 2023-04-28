import java.util.Arrays;

public class Twosn {
    public static void main(String[] args) {
        int[] arr= {77, 65, 77, 65, 77};
        System.out.println("arr:" + Arrays.toString(arr));
        int num1 = 77;
        int num2 = 65;
        System.out.println("result:" +result(arr, num1, num2));
    }

    public static boolean result(int[] arr, int num1, int num2) {
        for (int num : arr) {
            boolean r = num!=num1&&num!=num2;
            if (r) {
                return false;
            }
        }
        return true;
    }
}

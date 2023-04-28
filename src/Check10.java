import java.util.Arrays;

public class Check10 {
    public static void main(String[] args) {
        int[] arrn = {10, 20, 10, 30, 10,40,10};
        System.out.println("arr:" + Arrays.toString(arrn));
        int serno = 10;
        int fixs = 30;
        System.out.println("result:"+result(arrn,serno,fixs));
    }

    public static boolean result(int[] nums, int serno, int fixs) {
        int temps = 0;
        for (int num : nums) {
            if (num == serno) {
                temps += serno;
            }
            if (temps > fixs) {
                break;
            }
        }
        return temps == fixs;
    }
}







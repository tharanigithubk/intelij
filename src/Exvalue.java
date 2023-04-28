import java.util.Arrays;

public class Exvalue {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 7, 8, 9};
        System.out.println("arr:" + Arrays.toString(arr));
        int max = arr[0];
        int min = arr[0];
        float sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i]>max)
                max = arr[i];
            else if (arr[i]<min)
                min = arr[i];
        }
        float x =((sum-max-min)/(arr.length-2));
        System.out.printf("compute the average value of an array of integers except the largest and smallest values:%2f",x);
    }
}



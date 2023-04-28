import java.util.Arrays;

public class Difflsarr {
    public static void main(String[] args){
        int []arr={1,2,3,4,5};
        System.out.println("original array:"+ Arrays.toString(arr));
        int max_value=arr[0];
        int min=arr[0];
        for (int i=1;i<arr.length;i++) {
            if (arr[i] > max_value)
                max_value = arr[i];
            else if (arr[i] < min)
                min = arr[i];
        }
        System.out.println("Difference between the largest and smallest values of the said array:"+(max_value-min));
        }
    }


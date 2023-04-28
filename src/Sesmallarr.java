import java.util.Arrays;
public class Sesmallarr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, -1, -2};
        System.out.println("original numeric array:" + Arrays.toString(arr));
        int min = Integer.MAX_VALUE;
        int Second_min = Integer.MAX_VALUE;
        for (int i = 0; i<arr.length; i++){
            if (arr[i]==min){
                Second_min = min;
            }
                else if (arr[i]<min) {
                    Second_min = min;
                    min = arr[i];
                } else if (arr[i]<Second_min) {
                    Second_min = arr[i];
                }
            }
            System.out.println("Second lowest number is:" + Second_min);
    }
    }
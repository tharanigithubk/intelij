import java.util.Arrays;
public class Maxarr {
    static int max;
    static  int min;
    public static void max_min(int arr[]){
        max=arr[0];
        min=arr[0];
        int len=arr.length;
        for(int i=1;i<len-1;i=i+2){
            if(i+1>len) {
                if (arr[i]>max)max =arr[i];
                if (arr[i]<min)min =arr[i];
            }
            if(arr[i]>arr[i+1]){
                if (arr[i]<min)min=arr[i];
                if (arr[i]>max)max=arr[i + 1];
            }
            if(arr[i]<arr[i+1]){
                if(arr[i]<min)min=arr[i];
                if(arr[i+1]>max)max=arr[i+1];
            }
        }
    }
    public static void main(String[] args) {
        int[]arr={25,30,35,90,125};
        max_min(arr);
        System.out.println("my arr:" + Arrays.toString(arr));
        System.out.println("Maximum value of array=" + max);
        System.out.println("Minimum value of array=" + min);
    }
}






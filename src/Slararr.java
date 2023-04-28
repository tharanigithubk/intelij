import java.util.Arrays;
public class Slararr {
    public static void main(String[] args){
        int [] arr={1000,2000,1800,3500,3800};
        System.out.println("original numeric array:"+ Arrays.toString(arr));
        Arrays.sort(arr);
        int index=arr.length-1;
        while (arr[index]==arr[arr.length-1]) {
            index--;
        }
        System.out.println("Second largest value:"+arr[index]);
    }
}

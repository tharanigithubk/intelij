import java.util.Arrays;
public class Eoarr {
    public static void main(String[] args){
        int []arr={2,5,6,7,8};
        System.out.println("original array:"+ Arrays.toString(arr));
        int ctr=0;
        for (int i=0;i< arr.length;i++) {
            if (arr[i] % 2 == 0)
                ctr++;
        }
        System.out.println("Numbers of even numbers is:"+ctr);
        System.out.println("Numbers of odd numbers is:"+(arr.length-ctr));
        }
    }


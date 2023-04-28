import java.util.Arrays;
public class Removearr {
    public static void main(String[] args){
        int[]arr={0,1,2,3,4,5};
        System.out.println("Myarr:"+ Arrays.toString(arr));
        int removeIndex=1;
        for (int i=removeIndex;i<arr.length-1;i++) {
            arr[i] = arr[i + 1];
        }
        System.out.println("after removing the second elements:"+Arrays.toString(arr));
        }
    }


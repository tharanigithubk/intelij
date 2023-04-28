import java.util.Arrays;
public class Iteratingarr {
    public static void main(String[] args){
        int []arr={1,2,3};
        int []myarr=new int[3];
        System.out.println("arr:"+Arrays.toString(arr));
        for (int i=0;i<arr.length;i++) {
            myarr[i]=arr[i];
        }
        System.out.println("my arr:"+Arrays.toString(myarr));
    }

}
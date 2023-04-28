import java.util.Arrays;
public class Revarr {
    public static void main(String[] args){
        int []arr={5,10,15,20,25};
        System.out.println("myarr:"+ Arrays.toString(arr));
        for (int i=0;i<arr.length/2;i++)
        {
            int obj=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=obj;
        }
        System.out.println("Reverse array:"+Arrays.toString(arr));
    }
}

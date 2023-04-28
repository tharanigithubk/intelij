import javax.swing.text.Position;
import java.util.Arrays;
public class Spcp {
    public static void main(String[] args){
        int []arr={1,2,3,4,5};
        int IndexPosition=1;
        int newValue =3;
        System.out.println("arr:"+Arrays.toString(arr));
        for(int i=arr.length-1;i>IndexPosition;i--){
            arr[i] = arr[i-1];
        }
        arr[IndexPosition]=newValue;
        System.out.println("my arr:"+Arrays.toString(arr));
       }
    }


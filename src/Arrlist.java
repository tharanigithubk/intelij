import java.util.ArrayList;
import java.util.Arrays;

public class Arrlist {
    public static void main(String[] args){
        String[] arr=new String[]{"java","sql","c","c++"};
        ArrayList<String>list=new ArrayList<String >(Arrays.asList(arr));
        System.out.println(list);
    }
}

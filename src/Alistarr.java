import java.util.ArrayList;
public class Alistarr {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("python");
        list.add("java");
        list.add("php");
        list.add("c#");
        list.add("c++");
        list.add("perl");
        String[] arr = new String[list.size()];
        list.toArray(arr);
        for (String String : arr) {
            System.out.println(String);
        }
    }
}

import java.util.Arrays;
import java.util.HashSet;

public class Coms {
    public static void main(String[] args) {
        String[] arr1 = {"python", "java", "c"};
        String[] arr2 = {"java", "c", "sql"};
        System.out.println("arr1:" + Arrays.toString(arr1));
        System.out.println("arr2:" + Arrays.toString(arr2));
        HashSet<String> set = new HashSet<String>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i].equals(arr2[j])) {
                    set.add(arr1[i]);
                }
            }
        }
        System.out.println("Common element:" + (set));
    }
}






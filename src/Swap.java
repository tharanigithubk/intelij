import java.util.ArrayList;
import java.util.Collections;
public class Swap {
    public static void main(String[] args) {
        ArrayList<String> stringslist=new ArrayList<String>();
        stringslist.add("Audi");
        stringslist.add("Bmw");
        stringslist.add("Ford");
        stringslist.add("Honda");
        stringslist.add("Shiftdzire");
        stringslist.add("Xylo");
        System.out.println("Array List before swap:\n");
        for (String a:stringslist){
            System.out.println(a);
        }
        Collections.swap(stringslist,1,3);
        System.out.println("Array list after swap:\n");
        for (String b:stringslist){
            System.out.println(b);
        }
    }
}

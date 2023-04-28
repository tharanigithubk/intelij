import java.util.ArrayList;
import java.util.List;
public class Empty {
    public static void main(String[] args) {
        List<String> stringslist=new ArrayList<String>();
        stringslist.add("Audi");
        stringslist.add("Bmw");
        stringslist.add("Ford");
        stringslist.add("Honda");
        stringslist.add("Shiftdzire");
        stringslist.add("Xylo");
        System.out.println("Original array list:"+stringslist);
        stringslist.removeAll(stringslist);
        System.out.println("Array list after removing all elements:"+stringslist);
    }
}

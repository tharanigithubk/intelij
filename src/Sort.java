import java.util.*;
public class Sort {
    public static void main(String[] args) {
        List<String> stringslist=new ArrayList<String>();
        stringslist.add("Audi");
        stringslist.add("Bmw");
        stringslist.add("Ford");
        stringslist.add("Honda");
        stringslist.add("Shiftdzire");
        stringslist.add("Xylo");
        System.out.println("List before sort:"+stringslist);
        Collections.sort(stringslist);
        System.out.println("List after sort:"+stringslist);;
    }
}

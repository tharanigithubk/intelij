import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shufl {
    public static void main(String[] args) {
        List<String> stringslist=new ArrayList<String>();
        stringslist.add("Audi");
        stringslist.add("Bmw");
        stringslist.add("Ford");
        stringslist.add("Honda");
        stringslist.add("Shiftdzire");
        stringslist.add("Xylo");
        System.out.println("List before shuffling:"+stringslist);
        Collections.shuffle(stringslist);
        System.out.println("List after shuffling:"+stringslist);;
    }
}


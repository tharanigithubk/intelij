import java.util.ArrayList;
import java.util.List;
public class Stringlist {
    public static void main(String[] args) {
        List<String>stringslist=new ArrayList<String>();
        stringslist.add("Audi");
        stringslist.add("Bmw");
        stringslist.add("Ford");
        stringslist.add("Honda");
        stringslist.add("shiftdzire");
        stringslist.add("Xylo");
        System.out.println(stringslist);
        stringslist.add(1,"Hyundai");
        stringslist.add(4,"Ferrari");
        System.out.println(stringslist);
    }
}

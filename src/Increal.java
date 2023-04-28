import java.util.ArrayList;
public class Increal {
    public static void main(String[] args) {
        ArrayList<String>stringslist=new ArrayList<String>(3);
        stringslist.add("Audi");
        stringslist.add("Bmw");
        stringslist.add("Ford");
        System.out.println("Original arraylist:"+stringslist);
        stringslist.ensureCapacity(5);
        stringslist.add("Honda");
        stringslist.add("Shiftdzire");
        stringslist.add("Xylo");
        System.out.println("New increased arraylist:"+stringslist);

    }
}

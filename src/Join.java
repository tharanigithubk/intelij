import java.util.ArrayList;
public class Join {
    public static void main(String[] args) {
        ArrayList<String> stringslist1=new ArrayList<String>();
        stringslist1.add("Audi");
        stringslist1.add("Bmw");
        stringslist1.add("Ford");
        stringslist1.add("Honda");
        stringslist1.add("Shiftdzire");
        stringslist1.add("Xylo");
        System.out.println("First array list:"+stringslist1);
        ArrayList<String> stringslist2=new ArrayList<String>();
        stringslist2.add("Audi");
        stringslist2.add("Bmw");
        stringslist2.add("Ford");
        stringslist2.add("Honda");
        System.out.println("Second array list:"+stringslist2);
        ArrayList<String>a=new ArrayList<String>();
        a.addAll(stringslist1);
        a.addAll(stringslist2);
        System.out.println("New array list:"+a);
    }
}

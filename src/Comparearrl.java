import java.util.ArrayList;
public class Comparearrl {
    public static void main(String[] args) {
        ArrayList<String> stringslist1=new ArrayList<String>();
        stringslist1.add("Audi");
        stringslist1.add("Bmw");
        stringslist1.add("Ford");
        stringslist1.add("Honda");
        stringslist1.add("Shiftdzire");
        stringslist1.add("Xylo");
        ArrayList<String> stringslist2=new ArrayList<String>();
        stringslist2.add("Audi");
        stringslist2.add("Bmw");
        stringslist2.add("Ford");
        stringslist2.add("Honda");
        ArrayList<String> stringslist3=new ArrayList<String>();
        for (String e:stringslist1){
            stringslist3.add(stringslist2.contains(e)?"Yes":"No");
            System.out.println(stringslist3);
        }
    }
}
